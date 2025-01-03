// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AcknowledgeTaskResultRequest} extends {@link RequestModel}
 *
 * <p>AcknowledgeTaskResultRequest</p>
 */
public class AcknowledgeTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskDetailNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > taskDetailNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private AcknowledgeTaskResultRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.taskDetailNo = builder.taskDetailNo;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcknowledgeTaskResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return taskDetailNo
     */
    public java.util.List < String > getTaskDetailNo() {
        return this.taskDetailNo;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<AcknowledgeTaskResultRequest, Builder> {
        private String lang; 
        private java.util.List < String > taskDetailNo; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(AcknowledgeTaskResultRequest request) {
            super(request);
            this.lang = request.lang;
            this.taskDetailNo = request.taskDetailNo;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2659c29493e94416b297a7691340ccc4</p>
         */
        public Builder taskDetailNo(java.util.List < String > taskDetailNo) {
            this.putQueryParameter("TaskDetailNo", taskDetailNo);
            this.taskDetailNo = taskDetailNo;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public AcknowledgeTaskResultRequest build() {
            return new AcknowledgeTaskResultRequest(this);
        } 

    } 

}
