// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAndroidInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyAndroidInstanceRequest</p>
 */
public class ModifyAndroidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
    private String androidInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownBandwidthLimit")
    private Integer downBandwidthLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAndroidInstanceName")
    private String newAndroidInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpBandwidthLimit")
    private Integer upBandwidthLimit;

    private ModifyAndroidInstanceRequest(Builder builder) {
        super(builder);
        this.androidInstanceId = builder.androidInstanceId;
        this.downBandwidthLimit = builder.downBandwidthLimit;
        this.instanceIds = builder.instanceIds;
        this.newAndroidInstanceName = builder.newAndroidInstanceName;
        this.upBandwidthLimit = builder.upBandwidthLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAndroidInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceId
     */
    public String getAndroidInstanceId() {
        return this.androidInstanceId;
    }

    /**
     * @return downBandwidthLimit
     */
    public Integer getDownBandwidthLimit() {
        return this.downBandwidthLimit;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return newAndroidInstanceName
     */
    public String getNewAndroidInstanceName() {
        return this.newAndroidInstanceName;
    }

    /**
     * @return upBandwidthLimit
     */
    public Integer getUpBandwidthLimit() {
        return this.upBandwidthLimit;
    }

    public static final class Builder extends Request.Builder<ModifyAndroidInstanceRequest, Builder> {
        private String androidInstanceId; 
        private Integer downBandwidthLimit; 
        private java.util.List<String> instanceIds; 
        private String newAndroidInstanceName; 
        private Integer upBandwidthLimit; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAndroidInstanceRequest request) {
            super(request);
            this.androidInstanceId = request.androidInstanceId;
            this.downBandwidthLimit = request.downBandwidthLimit;
            this.instanceIds = request.instanceIds;
            this.newAndroidInstanceName = request.newAndroidInstanceName;
            this.upBandwidthLimit = request.upBandwidthLimit;
        } 

        /**
         * <p>The ID of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-8v5bjld0r7tkl****</p>
         */
        public Builder androidInstanceId(String androidInstanceId) {
            this.putQueryParameter("AndroidInstanceId", androidInstanceId);
            this.androidInstanceId = androidInstanceId;
            return this;
        }

        /**
         * DownBandwidthLimit.
         */
        public Builder downBandwidthLimit(Integer downBandwidthLimit) {
            this.putQueryParameter("DownBandwidthLimit", downBandwidthLimit);
            this.downBandwidthLimit = downBandwidthLimit;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The new name of the cloud phone instance.</p>
         * <blockquote>
         * <p> The name can be up to 30 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), or hyphens (-). It must start with letters but cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>new_name</p>
         */
        public Builder newAndroidInstanceName(String newAndroidInstanceName) {
            this.putQueryParameter("NewAndroidInstanceName", newAndroidInstanceName);
            this.newAndroidInstanceName = newAndroidInstanceName;
            return this;
        }

        /**
         * UpBandwidthLimit.
         */
        public Builder upBandwidthLimit(Integer upBandwidthLimit) {
            this.putQueryParameter("UpBandwidthLimit", upBandwidthLimit);
            this.upBandwidthLimit = upBandwidthLimit;
            return this;
        }

        @Override
        public ModifyAndroidInstanceRequest build() {
            return new ModifyAndroidInstanceRequest(this);
        } 

    } 

}
