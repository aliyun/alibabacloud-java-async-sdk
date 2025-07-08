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
 * {@link QueryCardSmsStatisticsSendRequest} extends {@link RequestModel}
 *
 * <p>QueryCardSmsStatisticsSendRequest</p>
 */
public class QueryCardSmsStatisticsSendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomTmpCode")
    private String customTmpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendDateEnd")
    private String sendDateEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendDateStart")
    private String sendDateStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmpCode")
    private String tmpCode;

    private QueryCardSmsStatisticsSendRequest(Builder builder) {
        super(builder);
        this.customTmpCode = builder.customTmpCode;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sendDateEnd = builder.sendDateEnd;
        this.sendDateStart = builder.sendDateStart;
        this.signName = builder.signName;
        this.tmpCode = builder.tmpCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsStatisticsSendRequest create() {
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
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<QueryCardSmsStatisticsSendRequest, Builder> {
        private String customTmpCode; 
        private Long pageNo; 
        private Long pageSize; 
        private String sendDateEnd; 
        private String sendDateStart; 
        private String signName; 
        private String tmpCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryCardSmsStatisticsSendRequest request) {
            super(request);
            this.customTmpCode = request.customTmpCode;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SendDateEnd.
         */
        public Builder sendDateEnd(String sendDateEnd) {
            this.putQueryParameter("SendDateEnd", sendDateEnd);
            this.sendDateEnd = sendDateEnd;
            return this;
        }

        /**
         * SendDateStart.
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
        public QueryCardSmsStatisticsSendRequest build() {
            return new QueryCardSmsStatisticsSendRequest(this);
        } 

    } 

}
