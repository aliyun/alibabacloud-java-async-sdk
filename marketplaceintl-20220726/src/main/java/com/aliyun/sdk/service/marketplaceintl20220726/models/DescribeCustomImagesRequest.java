// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomImagesRequest</p>
 */
public class DescribeCustomImagesRequest extends Request {
    @Body
    @NameInMap("Ak")
    private String ak;

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

    private DescribeCustomImagesRequest(Builder builder) {
        super(builder);
        this.ak = builder.ak;
        this.regionNo = builder.regionNo;
        this.requestId = builder.requestId;
        this.secret = builder.secret;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomImagesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCustomImagesRequest, Builder> {
        private String ak; 
        private String regionNo; 
        private String requestId; 
        private String secret; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomImagesRequest request) {
            super(request);
            this.ak = request.ak;
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
        public DescribeCustomImagesRequest build() {
            return new DescribeCustomImagesRequest(this);
        } 

    } 

}
