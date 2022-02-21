// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMixStreamRequest} extends {@link RequestModel}
 *
 * <p>CreateMixStreamRequest</p>
 */
public class CreateMixStreamRequest extends Request {
    @Query
    @NameInMap("CallbackConfig")
    private String callbackConfig;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("InputStreamList")
    @Validation(required = true)
    private String inputStreamList;

    @Query
    @NameInMap("LayoutId")
    @Validation(required = true)
    private String layoutId;

    @Query
    @NameInMap("OutputConfig")
    @Validation(required = true)
    private String outputConfig;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateMixStreamRequest(Builder builder) {
        super(builder);
        this.callbackConfig = builder.callbackConfig;
        this.domainName = builder.domainName;
        this.inputStreamList = builder.inputStreamList;
        this.layoutId = builder.layoutId;
        this.outputConfig = builder.outputConfig;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMixStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackConfig
     */
    public String getCallbackConfig() {
        return this.callbackConfig;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return inputStreamList
     */
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateMixStreamRequest, Builder> {
        private String callbackConfig; 
        private String domainName; 
        private String inputStreamList; 
        private String layoutId; 
        private String outputConfig; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMixStreamRequest response) {
            super(response);
            this.callbackConfig = response.callbackConfig;
            this.domainName = response.domainName;
            this.inputStreamList = response.inputStreamList;
            this.layoutId = response.layoutId;
            this.outputConfig = response.outputConfig;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * CallbackConfig.
         */
        public Builder callbackConfig(String callbackConfig) {
            this.putQueryParameter("CallbackConfig", callbackConfig);
            this.callbackConfig = callbackConfig;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * InputStreamList.
         */
        public Builder inputStreamList(String inputStreamList) {
            this.putQueryParameter("InputStreamList", inputStreamList);
            this.inputStreamList = inputStreamList;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * OutputConfig.
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateMixStreamRequest build() {
            return new CreateMixStreamRequest(this);
        } 

    } 

}
