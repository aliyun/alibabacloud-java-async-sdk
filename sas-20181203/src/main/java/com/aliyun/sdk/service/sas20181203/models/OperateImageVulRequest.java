// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateImageVulRequest} extends {@link RequestModel}
 *
 * <p>OperateImageVulRequest</p>
 */
public class OperateImageVulRequest extends Request {
    @Query
    @NameInMap("Info")
    private String info;

    @Query
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("Type")
    private String type;

    private OperateImageVulRequest(Builder builder) {
        super(builder);
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateImageVulRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateImageVulRequest, Builder> {
        private String info; 
        private String operateType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateImageVulRequest request) {
            super(request);
            this.info = request.info;
            this.operateType = request.operateType;
            this.type = request.type;
        } 

        /**
         * The information about the vulnerability. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   namespace: the namespace of the image
         * *   repoName: the name of the Container Registry repository
         * *   regionId: the region ID
         * *   instanceId: the ID of the Container Registry instance
         * *   repoId: the name of the repository
         * *   tag: the tad added to the image
         * *   digest: the digest of the image
         * *   newTag: the tag added to the image after the vulnerability is fixed
         * *   uuid: the UUID of the image
         * *   ids: the IDs of the vulnerability primary keys
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
         * If you want to fix the vulnerability, set the value to vul_fix.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The type of the vulnerability. Set the value to cve.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateImageVulRequest build() {
            return new OperateImageVulRequest(this);
        } 

    } 

}
