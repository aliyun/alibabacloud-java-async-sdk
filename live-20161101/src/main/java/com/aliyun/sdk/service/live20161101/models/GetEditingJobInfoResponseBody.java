// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetEditingJobInfoResponseBody</p>
 */
public class GetEditingJobInfoResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("EditingTasksInfo")
    private String editingTasksInfo;

    @NameInMap("RequestId")
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

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * EditingTasksInfo.
         */
        public Builder editingTasksInfo(String editingTasksInfo) {
            this.editingTasksInfo = editingTasksInfo;
            return this;
        }

        /**
         * RequestId.
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
