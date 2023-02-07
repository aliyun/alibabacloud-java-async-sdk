// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DuplexDecisionRequest} extends {@link RequestModel}
 *
 * <p>DuplexDecisionRequest</p>
 */
public class DuplexDecisionRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("BizRequestId")
    @Validation(required = true)
    private String bizRequestId;

    @Query
    @NameInMap("CallTime")
    @Validation(required = true)
    private Integer callTime;

    @Query
    @NameInMap("CustomKeywords")
    private java.util.List < String > customKeywords;

    @Query
    @NameInMap("DialogContext")
    private DialogContext dialogContext;

    @Query
    @NameInMap("DialogStatus")
    @Validation(required = true)
    private String dialogStatus;

    @Query
    @NameInMap("InterruptType")
    private Integer interruptType;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private DuplexDecisionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.bizRequestId = builder.bizRequestId;
        this.callTime = builder.callTime;
        this.customKeywords = builder.customKeywords;
        this.dialogContext = builder.dialogContext;
        this.dialogStatus = builder.dialogStatus;
        this.interruptType = builder.interruptType;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DuplexDecisionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return bizRequestId
     */
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    /**
     * @return callTime
     */
    public Integer getCallTime() {
        return this.callTime;
    }

    /**
     * @return customKeywords
     */
    public java.util.List < String > getCustomKeywords() {
        return this.customKeywords;
    }

    /**
     * @return dialogContext
     */
    public DialogContext getDialogContext() {
        return this.dialogContext;
    }

    /**
     * @return dialogStatus
     */
    public String getDialogStatus() {
        return this.dialogStatus;
    }

    /**
     * @return interruptType
     */
    public Integer getInterruptType() {
        return this.interruptType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<DuplexDecisionRequest, Builder> {
        private String appId; 
        private String bizRequestId; 
        private Integer callTime; 
        private java.util.List < String > customKeywords; 
        private DialogContext dialogContext; 
        private String dialogStatus; 
        private Integer interruptType; 
        private String sessionId; 
        private Long tenantId; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(DuplexDecisionRequest request) {
            super(request);
            this.appId = request.appId;
            this.bizRequestId = request.bizRequestId;
            this.callTime = request.callTime;
            this.customKeywords = request.customKeywords;
            this.dialogContext = request.dialogContext;
            this.dialogStatus = request.dialogStatus;
            this.interruptType = request.interruptType;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
            this.text = request.text;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BizRequestId.
         */
        public Builder bizRequestId(String bizRequestId) {
            this.putQueryParameter("BizRequestId", bizRequestId);
            this.bizRequestId = bizRequestId;
            return this;
        }

        /**
         * CallTime.
         */
        public Builder callTime(Integer callTime) {
            this.putQueryParameter("CallTime", callTime);
            this.callTime = callTime;
            return this;
        }

        /**
         * CustomKeywords.
         */
        public Builder customKeywords(java.util.List < String > customKeywords) {
            String customKeywordsShrink = shrink(customKeywords, "CustomKeywords", "json");
            this.putQueryParameter("CustomKeywords", customKeywordsShrink);
            this.customKeywords = customKeywords;
            return this;
        }

        /**
         * DialogContext.
         */
        public Builder dialogContext(DialogContext dialogContext) {
            String dialogContextShrink = shrink(dialogContext, "DialogContext", "json");
            this.putQueryParameter("DialogContext", dialogContextShrink);
            this.dialogContext = dialogContext;
            return this;
        }

        /**
         * DialogStatus.
         */
        public Builder dialogStatus(String dialogStatus) {
            this.putQueryParameter("DialogStatus", dialogStatus);
            this.dialogStatus = dialogStatus;
            return this;
        }

        /**
         * InterruptType.
         */
        public Builder interruptType(Integer interruptType) {
            this.putQueryParameter("InterruptType", interruptType);
            this.interruptType = interruptType;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public DuplexDecisionRequest build() {
            return new DuplexDecisionRequest(this);
        } 

    } 

    public static class Histories extends TeaModel {
        @NameInMap("Robot")
        private String robot;

        @NameInMap("User")
        private String user;

        private Histories(Builder builder) {
            this.robot = builder.robot;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histories create() {
            return builder().build();
        }

        /**
         * @return robot
         */
        public String getRobot() {
            return this.robot;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String robot; 
            private String user; 

            /**
             * Robot.
             */
            public Builder robot(String robot) {
                this.robot = robot;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Histories build() {
                return new Histories(this);
            } 

        } 

    }
    public static class DialogContext extends TeaModel {
        @NameInMap("CurUtteranceIdx")
        private Integer curUtteranceIdx;

        @NameInMap("Histories")
        private java.util.List < Histories> histories;

        private DialogContext(Builder builder) {
            this.curUtteranceIdx = builder.curUtteranceIdx;
            this.histories = builder.histories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogContext create() {
            return builder().build();
        }

        /**
         * @return curUtteranceIdx
         */
        public Integer getCurUtteranceIdx() {
            return this.curUtteranceIdx;
        }

        /**
         * @return histories
         */
        public java.util.List < Histories> getHistories() {
            return this.histories;
        }

        public static final class Builder {
            private Integer curUtteranceIdx; 
            private java.util.List < Histories> histories; 

            /**
             * CurUtteranceIdx.
             */
            public Builder curUtteranceIdx(Integer curUtteranceIdx) {
                this.curUtteranceIdx = curUtteranceIdx;
                return this;
            }

            /**
             * Histories.
             */
            public Builder histories(java.util.List < Histories> histories) {
                this.histories = histories;
                return this;
            }

            public DialogContext build() {
                return new DialogContext(this);
            } 

        } 

    }
}
