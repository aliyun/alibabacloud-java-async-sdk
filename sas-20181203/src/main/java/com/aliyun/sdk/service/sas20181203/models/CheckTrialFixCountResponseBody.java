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
 * {@link CheckTrialFixCountResponseBody} extends {@link TeaModel}
 *
 * <p>CheckTrialFixCountResponseBody</p>
 */
public class CheckTrialFixCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanFix")
    private Boolean canFix;

    @com.aliyun.core.annotation.NameInMap("ExpendCount")
    private Integer expendCount;

    @com.aliyun.core.annotation.NameInMap("RemainCount")
    private Integer remainCount;

    @com.aliyun.core.annotation.NameInMap("RepairedCount")
    private Integer repairedCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("isTrial")
    private Boolean isTrial;

    private CheckTrialFixCountResponseBody(Builder builder) {
        this.canFix = builder.canFix;
        this.expendCount = builder.expendCount;
        this.remainCount = builder.remainCount;
        this.repairedCount = builder.repairedCount;
        this.requestId = builder.requestId;
        this.isTrial = builder.isTrial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTrialFixCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canFix
     */
    public Boolean getCanFix() {
        return this.canFix;
    }

    /**
     * @return expendCount
     */
    public Integer getExpendCount() {
        return this.expendCount;
    }

    /**
     * @return remainCount
     */
    public Integer getRemainCount() {
        return this.remainCount;
    }

    /**
     * @return repairedCount
     */
    public Integer getRepairedCount() {
        return this.repairedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return isTrial
     */
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public static final class Builder {
        private Boolean canFix; 
        private Integer expendCount; 
        private Integer remainCount; 
        private Integer repairedCount; 
        private String requestId; 
        private Boolean isTrial; 

        private Builder() {
        } 

        private Builder(CheckTrialFixCountResponseBody model) {
            this.canFix = model.canFix;
            this.expendCount = model.expendCount;
            this.remainCount = model.remainCount;
            this.repairedCount = model.repairedCount;
            this.requestId = model.requestId;
            this.isTrial = model.isTrial;
        } 

        /**
         * <p>Indicates whether the vulnerability can be fixed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canFix(Boolean canFix) {
            this.canFix = canFix;
            return this;
        }

        /**
         * <p>The quota usage required for the current fix operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder expendCount(Integer expendCount) {
            this.expendCount = expendCount;
            return this;
        }

        /**
         * <p>The quota that remains after the current fix operation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder remainCount(Integer remainCount) {
            this.remainCount = remainCount;
            return this;
        }

        /**
         * <p>The number of the vulnerabilities that are fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder repairedCount(Integer repairedCount) {
            this.repairedCount = repairedCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether Security Center is in free trial. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }

        public CheckTrialFixCountResponseBody build() {
            return new CheckTrialFixCountResponseBody(this);
        } 

    } 

}
