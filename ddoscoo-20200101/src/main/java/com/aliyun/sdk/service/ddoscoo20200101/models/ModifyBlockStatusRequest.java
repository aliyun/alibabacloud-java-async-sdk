// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBlockStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyBlockStatusRequest</p>
 */
public class ModifyBlockStatusRequest extends Request {
    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lines")
    @Validation(required = true)
    private java.util.List < String > lines;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private ModifyBlockStatusRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.lines = builder.lines;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBlockStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lines
     */
    public java.util.List < String > getLines() {
        return this.lines;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyBlockStatusRequest, Builder> {
        private Integer duration; 
        private String instanceId; 
        private java.util.List < String > lines; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBlockStatusRequest response) {
            super(response);
            this.duration = response.duration;
            this.instanceId = response.instanceId;
            this.lines = response.lines;
            this.regionId = response.regionId;
            this.status = response.status;
        } 

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lines.
         */
        public Builder lines(java.util.List < String > lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyBlockStatusRequest build() {
            return new ModifyBlockStatusRequest(this);
        } 

    } 

}
