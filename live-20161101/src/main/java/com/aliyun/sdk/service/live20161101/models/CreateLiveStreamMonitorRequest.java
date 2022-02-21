// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveStreamMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveStreamMonitorRequest</p>
 */
public class CreateLiveStreamMonitorRequest extends Request {
    @Query
    @NameInMap("App")
    private String app;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("InputList")
    private String inputList;

    @Query
    @NameInMap("MonitorName")
    @Validation(required = true)
    private String monitorName;

    @Query
    @NameInMap("OutputTemplate")
    @Validation(required = true)
    private String outputTemplate;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Stream")
    private String stream;

    private CreateLiveStreamMonitorRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.domain = builder.domain;
        this.inputList = builder.inputList;
        this.monitorName = builder.monitorName;
        this.outputTemplate = builder.outputTemplate;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveStreamMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return inputList
     */
    public String getInputList() {
        return this.inputList;
    }

    /**
     * @return monitorName
     */
    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * @return outputTemplate
     */
    public String getOutputTemplate() {
        return this.outputTemplate;
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

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<CreateLiveStreamMonitorRequest, Builder> {
        private String app; 
        private String domain; 
        private String inputList; 
        private String monitorName; 
        private String outputTemplate; 
        private Long ownerId; 
        private String regionId; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveStreamMonitorRequest response) {
            super(response);
            this.app = response.app;
            this.domain = response.domain;
            this.inputList = response.inputList;
            this.monitorName = response.monitorName;
            this.outputTemplate = response.outputTemplate;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.stream = response.stream;
        } 

        /**
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * InputList.
         */
        public Builder inputList(String inputList) {
            this.putQueryParameter("InputList", inputList);
            this.inputList = inputList;
            return this;
        }

        /**
         * MonitorName.
         */
        public Builder monitorName(String monitorName) {
            this.putQueryParameter("MonitorName", monitorName);
            this.monitorName = monitorName;
            return this;
        }

        /**
         * OutputTemplate.
         */
        public Builder outputTemplate(String outputTemplate) {
            this.putQueryParameter("OutputTemplate", outputTemplate);
            this.outputTemplate = outputTemplate;
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

        /**
         * Stream.
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public CreateLiveStreamMonitorRequest build() {
            return new CreateLiveStreamMonitorRequest(this);
        } 

    } 

}
