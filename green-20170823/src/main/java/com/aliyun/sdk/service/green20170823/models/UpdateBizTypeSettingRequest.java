// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBizTypeSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateBizTypeSettingRequest</p>
 */
public class UpdateBizTypeSettingRequest extends Request {
    @Query
    @NameInMap("Ad")
    private String ad;

    @Query
    @NameInMap("Antispam")
    private String antispam;

    @Query
    @NameInMap("BizTypeName")
    @Validation(required = true)
    private String bizTypeName;

    @Query
    @NameInMap("Live")
    private String live;

    @Query
    @NameInMap("Porn")
    private String porn;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Terrorism")
    private String terrorism;

    private UpdateBizTypeSettingRequest(Builder builder) {
        super(builder);
        this.ad = builder.ad;
        this.antispam = builder.antispam;
        this.bizTypeName = builder.bizTypeName;
        this.live = builder.live;
        this.porn = builder.porn;
        this.resourceType = builder.resourceType;
        this.terrorism = builder.terrorism;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizTypeSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ad
     */
    public String getAd() {
        return this.ad;
    }

    /**
     * @return antispam
     */
    public String getAntispam() {
        return this.antispam;
    }

    /**
     * @return bizTypeName
     */
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    /**
     * @return live
     */
    public String getLive() {
        return this.live;
    }

    /**
     * @return porn
     */
    public String getPorn() {
        return this.porn;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return terrorism
     */
    public String getTerrorism() {
        return this.terrorism;
    }

    public static final class Builder extends Request.Builder<UpdateBizTypeSettingRequest, Builder> {
        private String ad; 
        private String antispam; 
        private String bizTypeName; 
        private String live; 
        private String porn; 
        private String resourceType; 
        private String terrorism; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBizTypeSettingRequest request) {
            super(request);
            this.ad = request.ad;
            this.antispam = request.antispam;
            this.bizTypeName = request.bizTypeName;
            this.live = request.live;
            this.porn = request.porn;
            this.resourceType = request.resourceType;
            this.terrorism = request.terrorism;
        } 

        /**
         * Ad.
         */
        public Builder ad(String ad) {
            this.putQueryParameter("Ad", ad);
            this.ad = ad;
            return this;
        }

        /**
         * Antispam.
         */
        public Builder antispam(String antispam) {
            this.putQueryParameter("Antispam", antispam);
            this.antispam = antispam;
            return this;
        }

        /**
         * BizTypeName.
         */
        public Builder bizTypeName(String bizTypeName) {
            this.putQueryParameter("BizTypeName", bizTypeName);
            this.bizTypeName = bizTypeName;
            return this;
        }

        /**
         * Live.
         */
        public Builder live(String live) {
            this.putQueryParameter("Live", live);
            this.live = live;
            return this;
        }

        /**
         * Porn.
         */
        public Builder porn(String porn) {
            this.putQueryParameter("Porn", porn);
            this.porn = porn;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Terrorism.
         */
        public Builder terrorism(String terrorism) {
            this.putQueryParameter("Terrorism", terrorism);
            this.terrorism = terrorism;
            return this;
        }

        @Override
        public UpdateBizTypeSettingRequest build() {
            return new UpdateBizTypeSettingRequest(this);
        } 

    } 

}
