// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeTaskErrorLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskErrorLogRequest</p>
 */
public class DescribeTaskErrorLogRequest extends Request {
    @Query
    @NameInMap("BuildTaskId")
    private String buildTaskId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;


    private DescribeTaskErrorLogRequest(Builder builder) {
        super(builder);
        this.buildTaskId = builder.buildTaskId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskErrorLogRequest create() {
        return builder().build();
    }

    /**
     * @return buildTaskId
     */
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder {
        private String buildTaskId; 
        private String sourceIp; 

        /**
         * <p>BuildTaskId.</p>
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public DescribeTaskErrorLogRequest build() {
            return new DescribeTaskErrorLogRequest(this);
        } 

    } 

}
