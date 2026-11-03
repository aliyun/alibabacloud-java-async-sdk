// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DeepfakeDetectRequest} extends {@link RequestModel}
 *
 * <p>DeepfakeDetectRequest</p>
 */
public class DeepfakeDetectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceAttributeCheck")
    private String faceAttributeCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceBase64")
    private String faceBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceInputType")
    private String faceInputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceUrl")
    private String faceUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
    private String outerOrderNo;

    private DeepfakeDetectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.faceAttributeCheck = builder.faceAttributeCheck;
        this.faceBase64 = builder.faceBase64;
        this.faceInputType = builder.faceInputType;
        this.faceUrl = builder.faceUrl;
        this.outerOrderNo = builder.outerOrderNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeepfakeDetectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return faceAttributeCheck
     */
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    /**
     * @return faceBase64
     */
    public String getFaceBase64() {
        return this.faceBase64;
    }

    /**
     * @return faceInputType
     */
    public String getFaceInputType() {
        return this.faceInputType;
    }

    /**
     * @return faceUrl
     */
    public String getFaceUrl() {
        return this.faceUrl;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public static final class Builder extends Request.Builder<DeepfakeDetectRequest, Builder> {
        private String regionId; 
        private String faceAttributeCheck; 
        private String faceBase64; 
        private String faceInputType; 
        private String faceUrl; 
        private String outerOrderNo; 

        private Builder() {
            super();
        } 

        private Builder(DeepfakeDetectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.faceAttributeCheck = request.faceAttributeCheck;
            this.faceBase64 = request.faceBase64;
            this.faceInputType = request.faceInputType;
            this.faceUrl = request.faceUrl;
            this.outerOrderNo = request.outerOrderNo;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable facial attribute detection.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder faceAttributeCheck(String faceAttributeCheck) {
            this.putQueryParameter("FaceAttributeCheck", faceAttributeCheck);
            this.faceAttributeCheck = faceAttributeCheck;
            return this;
        }

        /**
         * <p>The Base64-encoded string of the facial image.</p>
         * <blockquote>
         * <p>You must specify either FaceUrl or FaceBase64.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
         */
        public Builder faceBase64(String faceBase64) {
            this.putBodyParameter("FaceBase64", faceBase64);
            this.faceBase64 = faceBase64;
            return this;
        }

        /**
         * <p>The input type of the facial material. Valid values:</p>
         * <ul>
         * <li>IMAGE (default): facial image.</li>
         * <li>VIDEO: facial video.</li>
         * </ul>
         * <blockquote>
         * <p>Video processing takes a long time. Set the timeout period to greater than 3 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        public Builder faceInputType(String faceInputType) {
            this.putQueryParameter("FaceInputType", faceInputType);
            this.faceInputType = faceInputType;
            return this;
        }

        /**
         * <p>The URL of the facial image.</p>
         * <blockquote>
         * <p>You must specify either FaceUrl or FaceBase64.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
         */
        public Builder faceUrl(String faceUrl) {
            this.putQueryParameter("FaceUrl", faceUrl);
            this.faceUrl = faceUrl;
            return this;
        }

        /**
         * <p>The unique identifier of the merchant request. The value is a 32-character alphanumeric string. The first few characters consist of a custom abbreviation defined by the merchant, the middle part can contain a time period, and the latter part can be a random or incremental sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putQueryParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        @Override
        public DeepfakeDetectRequest build() {
            return new DeepfakeDetectRequest(this);
        } 

    } 

}
