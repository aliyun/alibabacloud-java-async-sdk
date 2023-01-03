// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpdRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpdRequest</p>
 */
public class UpdateVpdRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("VpdId")
    private String vpdId;

    private UpdateVpdRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<UpdateVpdRequest, Builder> {
        private String description; 
        private String name; 
        private String regionId; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpdRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.vpdId = request.vpdId;
        } 

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 灵骏网段名称
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 灵骏网段ID
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public UpdateVpdRequest build() {
            return new UpdateVpdRequest(this);
        } 

    } 

}
