// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DeleteOssFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteOssFileRequest</p>
 */
public class DeleteOssFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectName")
    private String objectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private DeleteOssFileRequest(Builder builder) {
        super(builder);
        this.objectName = builder.objectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOssFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteOssFileRequest, Builder> {
        private String objectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOssFileRequest request) {
            super(request);
            this.objectName = request.objectName;
            this.regionId = request.regionId;
        } 

        /**
         * objectName.
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("objectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteOssFileRequest build() {
            return new DeleteOssFileRequest(this);
        } 

    } 

}
