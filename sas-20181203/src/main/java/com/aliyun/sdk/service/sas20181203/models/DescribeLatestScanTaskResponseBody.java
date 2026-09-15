// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeLatestScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLatestScanTaskResponseBody</p>
 */
public class DescribeLatestScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LastCheckTime")
    private Long lastCheckTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskNum")
    private Integer riskNum;

    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    private String targetInfo;

    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List<String> uuids;

    private DescribeLatestScanTaskResponseBody(Builder builder) {
        this.lastCheckTime = builder.lastCheckTime;
        this.requestId = builder.requestId;
        this.riskNum = builder.riskNum;
        this.targetInfo = builder.targetInfo;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLatestScanTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lastCheckTime
     */
    public Long getLastCheckTime() {
        return this.lastCheckTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskNum
     */
    public Integer getRiskNum() {
        return this.riskNum;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    /**
     * @return uuids
     */
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public static final class Builder {
        private Long lastCheckTime; 
        private String requestId; 
        private Integer riskNum; 
        private String targetInfo; 
        private java.util.List<String> uuids; 

        private Builder() {
        } 

        private Builder(DescribeLatestScanTaskResponseBody model) {
            this.lastCheckTime = model.lastCheckTime;
            this.requestId = model.requestId;
            this.riskNum = model.riskNum;
            this.targetInfo = model.targetInfo;
            this.uuids = model.uuids;
        } 

        /**
         * <p>The timestamp of the most recent scan, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671610264000</p>
         */
        public Builder lastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42XXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of virus risks detected on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskNum(Integer riskNum) {
            this.riskNum = riskNum;
            return this;
        }

        /**
         * <p>The asset information scanned by the virus scan node. This parameter is expressed as a character string converted from a JSON array. The following fields are included:</p>
         * <ul>
         * <li><strong>type</strong>: The Asset Type on which the virus scan is executed. Valid values:<ul>
         * <li><strong>groupId</strong>: server group.</li>
         * <li><strong>uuid</strong>: server.</li>
         * </ul>
         * </li>
         * <li><strong>name</strong>: The name of the server group or server.</li>
         * <li><strong>target</strong>: The asset on which the virus scan is executed. The following describes the values of this field:<ul>
         * <li>If <strong>type</strong> is set to <strong>groupId</strong>, this field specifies the server group ID.</li>
         * <li>If <strong>type</strong> is set to <strong>uuid</strong>, this field specifies the UUID of the server.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;uuid&quot;,&quot;name&quot;:&quot;Host001&quot;,&quot;target&quot;:&quot;503201a7-14c6-4280-801b-1169ed42****&quot;}]</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * <p>The list of UUIDs of the assets.</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
            this.uuids = uuids;
            return this;
        }

        public DescribeLatestScanTaskResponseBody build() {
            return new DescribeLatestScanTaskResponseBody(this);
        } 

    } 

}
