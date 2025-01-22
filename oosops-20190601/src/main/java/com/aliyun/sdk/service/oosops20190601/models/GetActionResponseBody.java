// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

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
 * {@link GetActionResponseBody} extends {@link TeaModel}
 *
 * <p>GetActionResponseBody</p>
 */
public class GetActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionName")
    private String actionName;

    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.NameInMap("Content")
    private byte[] content;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("Popularity")
    private String popularity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetActionResponseBody(Builder builder) {
        this.actionName = builder.actionName;
        this.actionType = builder.actionType;
        this.content = builder.content;
        this.createTime = builder.createTime;
        this.modifiedTime = builder.modifiedTime;
        this.popularity = builder.popularity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return content
     */
    public byte[] getContent() {
        return this.content;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return popularity
     */
    public String getPopularity() {
        return this.popularity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String actionName; 
        private String actionType; 
        private byte[] content; 
        private String createTime; 
        private String modifiedTime; 
        private String popularity; 
        private String requestId; 

        /**
         * ActionName.
         */
        public Builder actionName(String actionName) {
            this.actionName = actionName;
            return this;
        }

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(byte[] content) {
            this.content = content;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * Popularity.
         */
        public Builder popularity(String popularity) {
            this.popularity = popularity;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetActionResponseBody build() {
            return new GetActionResponseBody(this);
        } 

    } 

}
