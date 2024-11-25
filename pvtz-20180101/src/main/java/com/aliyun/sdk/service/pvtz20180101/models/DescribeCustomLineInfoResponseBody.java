// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomLineInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomLineInfoResponseBody</p>
 */
public class DescribeCustomLineInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("CreatorSubType")
    private String creatorSubType;

    @com.aliyun.core.annotation.NameInMap("CreatorType")
    private String creatorType;

    @com.aliyun.core.annotation.NameInMap("Ipv4s")
    private java.util.List < String > ipv4s;

    @com.aliyun.core.annotation.NameInMap("LineId")
    private String lineId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    private DescribeCustomLineInfoResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.creator = builder.creator;
        this.creatorSubType = builder.creatorSubType;
        this.creatorType = builder.creatorType;
        this.ipv4s = builder.ipv4s;
        this.lineId = builder.lineId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLineInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return creatorSubType
     */
    public String getCreatorSubType() {
        return this.creatorSubType;
    }

    /**
     * @return creatorType
     */
    public String getCreatorType() {
        return this.creatorType;
    }

    /**
     * @return ipv4s
     */
    public java.util.List < String > getIpv4s() {
        return this.ipv4s;
    }

    /**
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String createTime; 
        private Long createTimestamp; 
        private String creator; 
        private String creatorSubType; 
        private String creatorType; 
        private java.util.List < String > ipv4s; 
        private String lineId; 
        private String name; 
        private String requestId; 
        private String updateTime; 
        private Long updateTimestamp; 

        /**
         * <p>The time when the custom line was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-23T03:15Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the custom line was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1516775741000</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The creator of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>260282302749096109</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The type of the creator. Valid values:</p>
         * <ul>
         * <li>CUSTOM: Alibaba Cloud account</li>
         * <li>SUB: RAM user</li>
         * <li>STS: assumed role that obtains the Security Token Service (STS) token of a RAM role</li>
         * <li>OTHER: other roles</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        public Builder creatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }

        /**
         * <p>The role of the creator. Valid values:</p>
         * <ul>
         * <li>USER: user</li>
         * <li>SYSTEM: system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * <p>The IPv4 CIDR blocks.</p>
         */
        public Builder ipv4s(java.util.List < String > ipv4s) {
            this.ipv4s = ipv4s;
            return this;
        }

        /**
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>100003</p>
         */
        public Builder lineId(String lineId) {
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The name of the custom line.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the custom line was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-24T06:35Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The time when the custom line was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1516775741000</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeCustomLineInfoResponseBody build() {
            return new DescribeCustomLineInfoResponseBody(this);
        } 

    } 

}
