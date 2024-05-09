// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBlockStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyBlockStatusRequest</p>
 */
public class ModifyBlockStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lines")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > lines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private ModifyBlockStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.lines = builder.lines;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyBlockStatusRequest, Builder> {
        private String regionId; 
        private Integer duration; 
        private String instanceId; 
        private java.util.List < String > lines; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBlockStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.lines = request.lines;
            this.status = request.status;
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
         * The blocking period. Valid values: **15** to **43200**. Unit: minutes.
         * <p>
         * 
         * > If you set **Status** to **do**, you must also specify this parameter.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The ID of the Anti-DDoS Pro instance to manage.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * An array consisting of the Internet service provider (ISP) lines from which traffic is blocked.
         */
        public Builder lines(java.util.List < String > lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        /**
         * Specifies the status of the Diversion from Origin Server policy. Valid values:
         * <p>
         * 
         * *   **do**: enables the policy.
         * *   **undo**: disables the policy.
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
