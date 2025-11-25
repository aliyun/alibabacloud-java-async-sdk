// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInternetOpenStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetOpenStatisticResponseBody</p>
 */
public class DescribeInternetOpenStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InternetIpNum")
    private Integer internetIpNum;

    @com.aliyun.core.annotation.NameInMap("InternetPortNum")
    private Integer internetPortNum;

    @com.aliyun.core.annotation.NameInMap("InternetRiskIpNum")
    private Integer internetRiskIpNum;

    @com.aliyun.core.annotation.NameInMap("InternetRiskPortNum")
    private Integer internetRiskPortNum;

    @com.aliyun.core.annotation.NameInMap("InternetRiskServiceNum")
    private Integer internetRiskServiceNum;

    @com.aliyun.core.annotation.NameInMap("InternetServiceNum")
    private Integer internetServiceNum;

    @com.aliyun.core.annotation.NameInMap("InternetSlbIpNum")
    private Integer internetSlbIpNum;

    @com.aliyun.core.annotation.NameInMap("InternetSlbIpPortNum")
    private Integer internetSlbIpPortNum;

    @com.aliyun.core.annotation.NameInMap("InternetUnprotectedPortNum")
    private Integer internetUnprotectedPortNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInternetOpenStatisticResponseBody(Builder builder) {
        this.internetIpNum = builder.internetIpNum;
        this.internetPortNum = builder.internetPortNum;
        this.internetRiskIpNum = builder.internetRiskIpNum;
        this.internetRiskPortNum = builder.internetRiskPortNum;
        this.internetRiskServiceNum = builder.internetRiskServiceNum;
        this.internetServiceNum = builder.internetServiceNum;
        this.internetSlbIpNum = builder.internetSlbIpNum;
        this.internetSlbIpPortNum = builder.internetSlbIpPortNum;
        this.internetUnprotectedPortNum = builder.internetUnprotectedPortNum;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return internetIpNum
     */
    public Integer getInternetIpNum() {
        return this.internetIpNum;
    }

    /**
     * @return internetPortNum
     */
    public Integer getInternetPortNum() {
        return this.internetPortNum;
    }

    /**
     * @return internetRiskIpNum
     */
    public Integer getInternetRiskIpNum() {
        return this.internetRiskIpNum;
    }

    /**
     * @return internetRiskPortNum
     */
    public Integer getInternetRiskPortNum() {
        return this.internetRiskPortNum;
    }

    /**
     * @return internetRiskServiceNum
     */
    public Integer getInternetRiskServiceNum() {
        return this.internetRiskServiceNum;
    }

    /**
     * @return internetServiceNum
     */
    public Integer getInternetServiceNum() {
        return this.internetServiceNum;
    }

    /**
     * @return internetSlbIpNum
     */
    public Integer getInternetSlbIpNum() {
        return this.internetSlbIpNum;
    }

    /**
     * @return internetSlbIpPortNum
     */
    public Integer getInternetSlbIpPortNum() {
        return this.internetSlbIpPortNum;
    }

    /**
     * @return internetUnprotectedPortNum
     */
    public Integer getInternetUnprotectedPortNum() {
        return this.internetUnprotectedPortNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer internetIpNum; 
        private Integer internetPortNum; 
        private Integer internetRiskIpNum; 
        private Integer internetRiskPortNum; 
        private Integer internetRiskServiceNum; 
        private Integer internetServiceNum; 
        private Integer internetSlbIpNum; 
        private Integer internetSlbIpPortNum; 
        private Integer internetUnprotectedPortNum; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInternetOpenStatisticResponseBody model) {
            this.internetIpNum = model.internetIpNum;
            this.internetPortNum = model.internetPortNum;
            this.internetRiskIpNum = model.internetRiskIpNum;
            this.internetRiskPortNum = model.internetRiskPortNum;
            this.internetRiskServiceNum = model.internetRiskServiceNum;
            this.internetServiceNum = model.internetServiceNum;
            this.internetSlbIpNum = model.internetSlbIpNum;
            this.internetSlbIpPortNum = model.internetSlbIpPortNum;
            this.internetUnprotectedPortNum = model.internetUnprotectedPortNum;
            this.requestId = model.requestId;
        } 

        /**
         * InternetIpNum.
         */
        public Builder internetIpNum(Integer internetIpNum) {
            this.internetIpNum = internetIpNum;
            return this;
        }

        /**
         * InternetPortNum.
         */
        public Builder internetPortNum(Integer internetPortNum) {
            this.internetPortNum = internetPortNum;
            return this;
        }

        /**
         * InternetRiskIpNum.
         */
        public Builder internetRiskIpNum(Integer internetRiskIpNum) {
            this.internetRiskIpNum = internetRiskIpNum;
            return this;
        }

        /**
         * InternetRiskPortNum.
         */
        public Builder internetRiskPortNum(Integer internetRiskPortNum) {
            this.internetRiskPortNum = internetRiskPortNum;
            return this;
        }

        /**
         * InternetRiskServiceNum.
         */
        public Builder internetRiskServiceNum(Integer internetRiskServiceNum) {
            this.internetRiskServiceNum = internetRiskServiceNum;
            return this;
        }

        /**
         * InternetServiceNum.
         */
        public Builder internetServiceNum(Integer internetServiceNum) {
            this.internetServiceNum = internetServiceNum;
            return this;
        }

        /**
         * InternetSlbIpNum.
         */
        public Builder internetSlbIpNum(Integer internetSlbIpNum) {
            this.internetSlbIpNum = internetSlbIpNum;
            return this;
        }

        /**
         * InternetSlbIpPortNum.
         */
        public Builder internetSlbIpPortNum(Integer internetSlbIpPortNum) {
            this.internetSlbIpPortNum = internetSlbIpPortNum;
            return this;
        }

        /**
         * InternetUnprotectedPortNum.
         */
        public Builder internetUnprotectedPortNum(Integer internetUnprotectedPortNum) {
            this.internetUnprotectedPortNum = internetUnprotectedPortNum;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInternetOpenStatisticResponseBody build() {
            return new DescribeInternetOpenStatisticResponseBody(this);
        } 

    } 

}
