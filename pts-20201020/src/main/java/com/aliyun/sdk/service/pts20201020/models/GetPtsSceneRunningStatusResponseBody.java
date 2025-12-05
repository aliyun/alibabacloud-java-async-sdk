// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetPtsSceneRunningStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsSceneRunningStatusResponseBody</p>
 */
public class GetPtsSceneRunningStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPtsSceneRunningStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
        this.sceneName = builder.sceneName;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPtsSceneRunningStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String createTime; 
        private Integer httpStatusCode; 
        private String message; 
        private String modifiedTime; 
        private String requestId; 
        private String sceneName; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPtsSceneRunningStatusResponseBody model) {
            this.code = model.code;
            this.createTime = model.createTime;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.modifiedTime = model.modifiedTime;
            this.requestId = model.requestId;
            this.sceneName = model.sceneName;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The system status code. If the operation is successful, this parameter is not returned</p>
         * 
         * <strong>example:</strong>
         * <p>4001</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the scenario was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-01 16:05:56</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The request status code. If the operation is successful, this parameter is not returned</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message. If the operation is successful, this parameter is not returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The last modification time of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-26 16:03:56</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the scenario.</p>
         */
        public Builder sceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }

        /**
         * <p>The status of the scenario. Valid values:</p>
         * <ul>
         * <li>CREATED</li>
         * <li>SYNCING</li>
         * <li>SYNC_DONE</li>
         * <li>UPLOADING</li>
         * <li>UPLOADED</li>
         * <li>PREPARING</li>
         * <li>READY</li>
         * <li>RUNNING</li>
         * <li>STOPPING</li>
         * <li>STOPPED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPtsSceneRunningStatusResponseBody build() {
            return new GetPtsSceneRunningStatusResponseBody(this);
        } 

    } 

}
