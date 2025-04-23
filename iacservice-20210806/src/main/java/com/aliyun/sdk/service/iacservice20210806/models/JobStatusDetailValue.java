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
 * {@link JobStatusDetailValue} extends {@link TeaModel}
 *
 * <p>JobStatusDetailValue</p>
 */
public class JobStatusDetailValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("jobResult")
    private String jobResult;

    @com.aliyun.core.annotation.NameInMap("timeStamps")
    private String timeStamps;

    private JobStatusDetailValue(Builder builder) {
        this.comment = builder.comment;
        this.jobResult = builder.jobResult;
        this.timeStamps = builder.timeStamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobStatusDetailValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return jobResult
     */
    public String getJobResult() {
        return this.jobResult;
    }

    /**
     * @return timeStamps
     */
    public String getTimeStamps() {
        return this.timeStamps;
    }

    public static final class Builder {
        private String comment; 
        private String jobResult; 
        private String timeStamps; 

        private Builder() {
        } 

        private Builder(JobStatusDetailValue model) {
            this.comment = model.comment;
            this.jobResult = model.jobResult;
            this.timeStamps = model.timeStamps;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * jobResult.
         */
        public Builder jobResult(String jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        /**
         * timeStamps.
         */
        public Builder timeStamps(String timeStamps) {
            this.timeStamps = timeStamps;
            return this;
        }

        public JobStatusDetailValue build() {
            return new JobStatusDetailValue(this);
        } 

    } 

}
