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
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("jobResult")
    private String jobResult;

    @com.aliyun.core.annotation.NameInMap("timeStamps")
    private String timeStamps;

    private JobsStatusDetailValue(Builder builder) {
        this.comment = builder.comment;
        this.jobResult = builder.jobResult;
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

        private Builder(JobsStatusDetailValue model) {
            this.comment = model.comment;
            this.jobResult = model.jobResult;
            this.timeStamps = model.timeStamps;
        } 

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The job execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>Apply complete! Resources: 0 added, 0 changed, 0 destroyed.</p>
         */
        public Builder jobResult(String jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        /**
         * <p>The time when the status was reached, in the format of YYYY-MM-DD HH:mm:ss. The returned value does not include a time zone identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-13 17:11:34</p>
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
