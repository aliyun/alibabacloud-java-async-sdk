// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ModifyInstanceMaintainTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceMaintainTimeRequest</p>
 */
public class ModifyInstanceMaintainTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainStartTime;

    private ModifyInstanceMaintainTimeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceMaintainTimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceMaintainTimeRequest, Builder> {
        private String clusterId; 
        private String maintainEndTime; 
        private String maintainStartTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceMaintainTimeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.maintainEndTime = request.maintainEndTime;
            this.maintainStartTime = request.maintainStartTime;
        } 

        /**
         * <p>The ID of the instance for which you want to modify the O&amp;M window. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1b<strong>6jco89</strong>**</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end time of the instance O&amp;M window. Specify the time in the HH:mmZ format in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00Z</p>
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>The start time of the instance O&amp;M window. Specify the time in the HH:mmZ format in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00Z</p>
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        @Override
        public ModifyInstanceMaintainTimeRequest build() {
            return new ModifyInstanceMaintainTimeRequest(this);
        } 

    } 

}
