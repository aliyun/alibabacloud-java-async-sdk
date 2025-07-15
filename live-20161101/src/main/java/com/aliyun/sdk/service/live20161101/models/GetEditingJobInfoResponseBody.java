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
 * {@link GetEditingJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetEditingJobInfoResponseBody</p>
 */
public class GetEditingJobInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("EditingTasksInfo")
    private String editingTasksInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEditingJobInfoResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.editingTasksInfo = builder.editingTasksInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEditingJobInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return editingTasksInfo
     */
    public String getEditingTasksInfo() {
        return this.editingTasksInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String casterId; 
        private String editingTasksInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEditingJobInfoResponseBody model) {
            this.casterId = model.casterId;
            this.editingTasksInfo = model.editingTasksInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>53200b81-b761-4c10-842a-a0726d97****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The information about editing tasks. The following fields are returned for each editing task:</p>
         * <ul>
         * <li><strong>OutputVodId</strong>: the ID of the output video-on-demand (VOD) file.</li>
         * <li><strong>TaskStatus</strong>: the status of the editing task. Valid values: -1, 0, 1, 2, and 3. A value of -1 indicates that the editing task fails. A value of 0 indicates that the editing task is being initialized. A value of 1 indicates that editing is in progress. A value of 2 indicates that the output VOD file is being uploaded. A value of 3 indicates that the editing task is successful.</li>
         * <li><strong>StorageLocation</strong>: the storage location in ApsaraVideo VOD.</li>
         * <li><strong>FileName</strong>: the name of the file that is edited.</li>
         * <li><strong>ShowId</strong>: the ID of the episode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;EditingTasksInfo&quot;: {     &quot;OutputVodId&quot;: &quot;3e34733b40b9a96ccf5c1ff6f69****&quot;,     &quot;TaskStatus&quot;: 1,     &quot;StorageInfo&quot;: {       &quot;StorageLocation&quot;: &quot;<em><strong>bucket</strong></em>&quot;,       &quot;FileName&quot;: &quot;EditFile****&quot;     },     &quot;ShowId&quot;: &quot;42200b81-b761-4c10-842a-a0726d97****&quot;   },</p>
         */
        public Builder editingTasksInfo(String editingTasksInfo) {
            this.editingTasksInfo = editingTasksInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEditingJobInfoResponseBody build() {
            return new GetEditingJobInfoResponseBody(this);
        } 

    } 

}
