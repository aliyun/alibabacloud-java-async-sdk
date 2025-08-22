// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link JobsStatusDetailValue} extends {@link TeaModel}
 *
 * <p>JobsStatusDetailValue</p>
 */
public class JobsStatusDetailValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobResult")
    private String jobResult;

    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("timeStamps")
    private String timeStamps;

    private JobsStatusDetailValue(Builder builder) {
        this.jobResult = builder.jobResult;
        this.comment = builder.comment;
        this.timeStamps = builder.timeStamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobsStatusDetailValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobResult
     */
    public String getJobResult() {
        return this.jobResult;
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

    public static final class Builder {
        private String jobResult; 
        private String comment; 
        private String timeStamps; 

        private Builder() {
        } 

        private Builder(JobsStatusDetailValue model) {
            this.jobResult = model.jobResult;
            this.comment = model.comment;
            this.timeStamps = model.timeStamps;
        } 

        /**
         * jobResult.
         */
        public Builder jobResult(String jobResult) {
            this.jobResult = jobResult;
            return this;
        }

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

        public JobsStatusDetailValue build() {
            return new JobsStatusDetailValue(this);
        } 

    } 

}
