// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link EditShowAndReplaceResponseBody} extends {@link TeaModel}
 *
 * <p>EditShowAndReplaceResponseBody</p>
 */
public class EditShowAndReplaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobInfo")
    private String jobInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EditShowAndReplaceResponseBody(Builder builder) {
        this.jobInfo = builder.jobInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditShowAndReplaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobInfo
     */
    public String getJobInfo() {
        return this.jobInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EditShowAndReplaceResponseBody model) {
            this.jobInfo = model.jobInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the editing task. The following fields are included:</p>
         * <ul>
         * <li><strong>vodId</strong>: the ID of the VOD file.</li>
         * <li><strong>mediaid</strong>: the ID of the media file.</li>
         * <li><strong>jobId</strong>: the ID of the editing task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{         &quot;vodId&quot;: &quot;3e34733b40b9a96ccf5c1ff6f69****&quot;,         &quot;mediaid&quot;: &quot;eb1861d2c9a842340e989dd56****&quot;,         &quot;jobId&quot;: &quot;7d2fbc380b0e08e55fe98733764****&quot;     }</p>
         */
        public Builder jobInfo(String jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditShowAndReplaceResponseBody build() {
            return new EditShowAndReplaceResponseBody(this);
        } 

    } 

}
