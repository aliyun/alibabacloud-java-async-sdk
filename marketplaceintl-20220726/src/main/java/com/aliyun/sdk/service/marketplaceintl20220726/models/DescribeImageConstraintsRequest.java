// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageConstraintsRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageConstraintsRequest</p>
 */
public class DescribeImageConstraintsRequest extends Request {
    @Body
    @NameInMap("Ak")
    private String ak;

    @Body
    @NameInMap("ImageId")
    private String imageId;

    @Body
    @NameInMap("RegionNo")
    private String regionNo;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("Secret")
    private String secret;

    @Body
    @NameInMap("Uid")
    private String uid;

    private DescribeImageConstraintsRequest(Builder builder) {
        super(builder);
        this.ak = builder.ak;
        this.imageId = builder.imageId;
        this.regionNo = builder.regionNo;
        this.requestId = builder.requestId;
        this.secret = builder.secret;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageConstraintsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ak
     */
    public String getAk() {
        return this.ak;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return this.secret;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DescribeImageConstraintsRequest, Builder> {
        private String ak; 
        private String imageId; 
        private String regionNo; 
        private String requestId; 
        private String secret; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageConstraintsRequest request) {
            super(request);
            this.ak = request.ak;
            this.imageId = request.imageId;
            this.regionNo = request.regionNo;
            this.requestId = request.requestId;
            this.secret = request.secret;
            this.uid = request.uid;
        } 

        /**
         * Ak.
         */
        public Builder ak(String ak) {
            this.putBodyParameter("Ak", ak);
            this.ak = ak;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putBodyParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * Secret.
         */
        public Builder secret(String secret) {
            this.putBodyParameter("Secret", secret);
            this.secret = secret;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DescribeImageConstraintsRequest build() {
            return new DescribeImageConstraintsRequest(this);
        } 

    } 

}
