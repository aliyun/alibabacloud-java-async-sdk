// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IndexJsonKey} extends {@link TeaModel}
 *
 * <p>IndexJsonKey</p>
 */
public class IndexJsonKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chn")
    private String chn;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private IndexJsonKey(Builder builder) {
        this.chn = builder.chn;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexJsonKey create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chn
     */
    public String getChn() {
        return this.chn;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String chn; 
        private String type; 

        private Builder() {
        } 

        private Builder(IndexJsonKey model) {
            this.chn = model.chn;
            this.type = model.type;
        } 

        /**
         * chn.
         */
        public Builder chn(String chn) {
            this.chn = chn;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IndexJsonKey build() {
            return new IndexJsonKey(this);
        } 

    } 

}
