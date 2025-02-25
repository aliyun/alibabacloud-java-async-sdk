// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAnswerLibRequest} extends {@link RequestModel}
 *
 * <p>ModifyAnswerLibRequest</p>
 */
public class ModifyAnswerLibRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LibName")
    private String libName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyAnswerLibRequest(Builder builder) {
        super(builder);
        this.libId = builder.libId;
        this.libName = builder.libName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAnswerLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return libName
     */
    public String getLibName() {
        return this.libName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyAnswerLibRequest, Builder> {
        private String libId; 
        private String libName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAnswerLibRequest request) {
            super(request);
            this.libId = request.libId;
            this.libName = request.libName;
            this.regionId = request.regionId;
        } 

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putQueryParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * LibName.
         */
        public Builder libName(String libName) {
            this.putQueryParameter("LibName", libName);
            this.libName = libName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyAnswerLibRequest build() {
            return new ModifyAnswerLibRequest(this);
        } 

    } 

}
