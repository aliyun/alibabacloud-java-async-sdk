// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link ModelFileUploadRequest} extends {@link RequestModel}
 *
 * <p>ModelFileUploadRequest</p>
 */
public class ModelFileUploadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    private ModelFileUploadRequest(Builder builder) {
        super(builder);
        this.objectName = builder.objectName;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelFileUploadRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<ModelFileUploadRequest, Builder> {
        private String objectName; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(ModelFileUploadRequest request) {
            super(request);
            this.objectName = request.objectName;
            this.regId = request.regId;
        } 

        /**
         * <p>File name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-10/商品信息批量导出-20230710132028</p>
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("ObjectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public ModelFileUploadRequest build() {
            return new ModelFileUploadRequest(this);
        } 

    } 

}
