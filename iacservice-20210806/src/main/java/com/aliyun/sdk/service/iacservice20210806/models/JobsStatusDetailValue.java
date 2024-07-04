// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobsStatusDetailValue} extends {@link TeaModel}
 *
 * <p>JobsStatusDetailValue</p>
 */
public class JobsStatusDetailValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("timeStamps")
    private String timeStamps;

    @com.aliyun.core.annotation.NameInMap("jobResult")
    private String jobResult;

    private JobsStatusDetailValue(Builder builder) {
        this.comment = builder.comment;
        this.timeStamps = builder.timeStamps;
        this.jobResult = builder.jobResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobsStatusDetailValue create() {
        return builder().build();
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return timeStamps
     */
    public String getTimeStamps() {
        return this.timeStamps;
    }

    /**
     * @return jobResult
     */
    public String getJobResult() {
        return this.jobResult;
    }

    public static final class Builder {
        private String comment; 
        private String timeStamps; 
        private String jobResult; 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * timeStamps.
         */
        public Builder timeStamps(String timeStamps) {
            this.timeStamps = timeStamps;
            return this;
        }

        /**
         * jobResult.
         */
        public Builder jobResult(String jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        public JobsStatusDetailValue build() {
            return new JobsStatusDetailValue(this);
        } 

    } 

}
