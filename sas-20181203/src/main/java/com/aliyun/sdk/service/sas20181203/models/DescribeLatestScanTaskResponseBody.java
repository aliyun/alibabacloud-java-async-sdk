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

        /**
         * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671610264000</p>
         */
        public Builder lastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42XXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of virus detection risks on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskNum(Integer riskNum) {
            this.riskNum = riskNum;
            return this;
        }

        /**
         * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the applicable scope. Valid values:</p>
         * <ul>
         * <li><strong>GroupId</strong>: the ID of a server group</li>
         * <li><strong>Uuid</strong>: the UUID of a server</li>
         * </ul>
         * </li>
         * <li><p><strong>uuids</strong>: the UUIDs of servers</p>
         * </li>
         * <li><p><strong>groupIds</strong>: the IDs of server groups</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, all servers are added to the whitelist. If you set the <strong>type</strong> field to <strong>GroupId</strong>, you must also specify the <strong>groupIds</strong> field. If you set the <strong>type</strong> field to <strong>Uuid</strong>, you must also specify the <strong>uuids</strong> field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;uuid&quot;,&quot;name&quot;:&quot;Host001&quot;,&quot;target&quot;:&quot;503201a7-14c6-4280-801b-1169ed42****&quot;}]</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * <p>The UUIDs of the assets.</p>
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
