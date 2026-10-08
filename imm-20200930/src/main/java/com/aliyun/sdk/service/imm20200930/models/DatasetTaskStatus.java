// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DatasetTaskStatus} extends {@link TeaModel}
 *
 * <p>DatasetTaskStatus</p>
 */
public class DatasetTaskStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LastSucceededTime")
    private String lastSucceededTime;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DatasetTaskStatus(Builder builder) {
        this.lastSucceededTime = builder.lastSucceededTime;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetTaskStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lastSucceededTime
     */
    public String getLastSucceededTime() {
        return this.lastSucceededTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String lastSucceededTime; 
        private String startTime; 
        private String status; 

        private Builder() {
        } 

        private Builder(DatasetTaskStatus model) {
            this.lastSucceededTime = model.lastSucceededTime;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The time of the last completion.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder lastSucceededTime(String lastSucceededTime) {
            this.lastSucceededTime = lastSucceededTime;
            return this;
        }

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DatasetTaskStatus build() {
            return new DatasetTaskStatus(this);
        } 

    } 

}
