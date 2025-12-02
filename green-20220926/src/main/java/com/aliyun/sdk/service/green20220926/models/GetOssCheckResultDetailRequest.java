// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetOssCheckResultDetailRequest} extends {@link RequestModel}
 *
 * <p>GetOssCheckResultDetailRequest</p>
 */
public class GetOssCheckResultDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private Integer mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Object")
    private String object;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTaskId")
    private String parentTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryRequestId")
    private String queryRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    private GetOssCheckResultDetailRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.mediaType = builder.mediaType;
        this.object = builder.object;
        this.parentTaskId = builder.parentTaskId;
        this.queryRequestId = builder.queryRequestId;
        this.regionId = builder.regionId;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckResultDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return mediaType
     */
    public Integer getMediaType() {
        return this.mediaType;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return parentTaskId
     */
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    /**
     * @return queryRequestId
     */
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<GetOssCheckResultDetailRequest, Builder> {
        private String bucket; 
        private Integer mediaType; 
        private String object; 
        private String parentTaskId; 
        private String queryRequestId; 
        private String regionId; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetOssCheckResultDetailRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.mediaType = request.mediaType;
            this.object = request.object;
            this.parentTaskId = request.parentTaskId;
            this.queryRequestId = request.queryRequestId;
            this.regionId = request.regionId;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * <p>Bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-tmp</p>
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>Media type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mediaType(Integer mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>Object name.</p>
         * 
         * <strong>example:</strong>
         * <p>1748396909030.jpg</p>
         */
        public Builder object(String object) {
            this.putQueryParameter("Object", object);
            this.object = object;
            return this;
        }

        /**
         * <p>Parent task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>P_RZQ66T</p>
         */
        public Builder parentTaskId(String parentTaskId) {
            this.putQueryParameter("ParentTaskId", parentTaskId);
            this.parentTaskId = parentTaskId;
            return this;
        }

        /**
         * <p>Query request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62E97001-1255-50A9-8E1E-4FD05473D952</p>
         */
        public Builder queryRequestId(String queryRequestId) {
            this.putQueryParameter("QueryRequestId", queryRequestId);
            this.queryRequestId = queryRequestId;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Service code.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_media_detection_01</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public GetOssCheckResultDetailRequest build() {
            return new GetOssCheckResultDetailRequest(this);
        } 

    } 

}
