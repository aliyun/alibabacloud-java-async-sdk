// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetMetaEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaEntityResponseBody</p>
 */
public class GetMetaEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetaEntity")
    private MetaEntity metaEntity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaEntityResponseBody(Builder builder) {
        this.metaEntity = builder.metaEntity;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaEntity
     */
    public MetaEntity getMetaEntity() {
        return this.metaEntity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private MetaEntity metaEntity; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMetaEntityResponseBody model) {
            this.metaEntity = model.metaEntity;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * MetaEntity.
         */
        public Builder metaEntity(MetaEntity metaEntity) {
            this.metaEntity = metaEntity;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0A04C673-BEFA-5803-94E5-89E2D9F8C567</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaEntityResponseBody build() {
            return new GetMetaEntityResponseBody(this);
        } 

    } 

}
