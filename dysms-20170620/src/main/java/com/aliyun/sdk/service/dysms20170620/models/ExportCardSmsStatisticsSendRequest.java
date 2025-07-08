// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link ExportCardSmsStatisticsSendRequest} extends {@link RequestModel}
 *
 * <p>ExportCardSmsStatisticsSendRequest</p>
 */
public class ExportCardSmsStatisticsSendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomTmpCode")
    private String customTmpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendDateEnd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sendDateEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendDateStart")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sendDateStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmpCode")
    private String tmpCode;

    private ExportCardSmsStatisticsSendRequest(Builder builder) {
        super(builder);
        this.customTmpCode = builder.customTmpCode;
        this.sendDateEnd = builder.sendDateEnd;
        this.sendDateStart = builder.sendDateStart;
        this.signName = builder.signName;
        this.tmpCode = builder.tmpCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCardSmsStatisticsSendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customTmpCode
     */
    public String getCustomTmpCode() {
        return this.customTmpCode;
    }

    /**
     * @return sendDateEnd
     */
    public String getSendDateEnd() {
        return this.sendDateEnd;
    }

    /**
     * @return sendDateStart
     */
    public String getSendDateStart() {
        return this.sendDateStart;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return tmpCode
     */
    public String getTmpCode() {
        return this.tmpCode;
    }

    public static final class Builder extends Request.Builder<ExportCardSmsStatisticsSendRequest, Builder> {
        private String customTmpCode; 
        private String sendDateEnd; 
        private String sendDateStart; 
        private String signName; 
        private String tmpCode; 

        private Builder() {
            super();
        } 

        private Builder(ExportCardSmsStatisticsSendRequest request) {
            super(request);
            this.customTmpCode = request.customTmpCode;
            this.sendDateEnd = request.sendDateEnd;
            this.sendDateStart = request.sendDateStart;
            this.signName = request.signName;
            this.tmpCode = request.tmpCode;
        } 

        /**
         * CustomTmpCode.
         */
        public Builder customTmpCode(String customTmpCode) {
            this.putQueryParameter("CustomTmpCode", customTmpCode);
            this.customTmpCode = customTmpCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sendDateEnd(String sendDateEnd) {
            this.putQueryParameter("SendDateEnd", sendDateEnd);
            this.sendDateEnd = sendDateEnd;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sendDateStart(String sendDateStart) {
            this.putQueryParameter("SendDateStart", sendDateStart);
            this.sendDateStart = sendDateStart;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * TmpCode.
         */
        public Builder tmpCode(String tmpCode) {
            this.putQueryParameter("TmpCode", tmpCode);
            this.tmpCode = tmpCode;
            return this;
        }

        @Override
        public ExportCardSmsStatisticsSendRequest build() {
            return new ExportCardSmsStatisticsSendRequest(this);
        } 

    } 

}
