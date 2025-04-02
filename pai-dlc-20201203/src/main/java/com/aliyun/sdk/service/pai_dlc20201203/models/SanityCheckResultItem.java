// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link SanityCheckResultItem} extends {@link TeaModel}
 *
 * <p>SanityCheckResultItem</p>
 */
public class SanityCheckResultItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckNumber")
    private Integer checkNumber;

    @com.aliyun.core.annotation.NameInMap("FinishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("StartedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private SanityCheckResultItem(Builder builder) {
        this.checkNumber = builder.checkNumber;
        this.finishedAt = builder.finishedAt;
        this.message = builder.message;
        this.phase = builder.phase;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SanityCheckResultItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkNumber
     */
    public Integer getCheckNumber() {
        return this.checkNumber;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer checkNumber; 
        private String finishedAt; 
        private String message; 
        private String phase; 
        private String startedAt; 
        private String status; 

        private Builder() {
        } 

        private Builder(SanityCheckResultItem model) {
            this.checkNumber = model.checkNumber;
            this.finishedAt = model.finishedAt;
            this.message = model.message;
            this.phase = model.phase;
            this.startedAt = model.startedAt;
            this.status = model.status;
        } 

        /**
         * CheckNumber.
         */
        public Builder checkNumber(Integer checkNumber) {
            this.checkNumber = checkNumber;
            return this;
        }

        /**
         * FinishedAt.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * StartedAt.
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SanityCheckResultItem build() {
            return new SanityCheckResultItem(this);
        } 

    } 

}
