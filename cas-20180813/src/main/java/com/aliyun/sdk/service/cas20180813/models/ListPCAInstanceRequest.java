// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180813.models;

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
 * {@link ListPCAInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListPCAInstanceRequest</p>
 */
public class ListPCAInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListPCAInstanceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.showSize = builder.showSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPCAInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPCAInstanceRequest, Builder> {
        private Long currentPage; 
        private Long showSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPCAInstanceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.showSize = request.showSize;
            this.type = request.type;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Long showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPCAInstanceRequest build() {
            return new ListPCAInstanceRequest(this);
        } 

    } 

}
