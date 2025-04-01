// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStaticsQueryResponse} extends {@link TeaModel}
 *
 * <p>ListStaticsQueryResponse</p>
 */
public class ListStaticsQueryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("length")
    private Long length;

    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    @com.aliyun.core.annotation.NameInMap("statics")
    private java.util.List<StaticsInfo> statics;

    private ListStaticsQueryResponse(BuilderImpl builder) {
        super(builder);
        this.length = builder.length;
        this.sort = builder.sort;
        this.statics = builder.statics;
    }

    public static ListStaticsQueryResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return length
     */
    public Long getLength() {
        return this.length;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return statics
     */
    public java.util.List<StaticsInfo> getStatics() {
        return this.statics;
    }

    public interface Builder extends Response.Builder<ListStaticsQueryResponse, Builder> {

        Builder length(Long length);

        Builder sort(String sort);

        Builder statics(java.util.List<StaticsInfo> statics);

        @Override
        ListStaticsQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStaticsQueryResponse, Builder>
            implements Builder {
        private Long length; 
        private String sort; 
        private java.util.List<StaticsInfo> statics; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStaticsQueryResponse response) {
            super(response);
            this.length = response.length;
            this.sort = response.sort;
            this.statics = response.statics;
        } 

        /**
         * length.
         */
        @Override
        public Builder length(Long length) {
            this.length = length;
            return this;
        }

        /**
         * sort.
         */
        @Override
        public Builder sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
         * statics.
         */
        @Override
        public Builder statics(java.util.List<StaticsInfo> statics) {
            this.statics = statics;
            return this;
        }

        @Override
        public ListStaticsQueryResponse build() {
            return new ListStaticsQueryResponse(this);
        } 

    } 

}
