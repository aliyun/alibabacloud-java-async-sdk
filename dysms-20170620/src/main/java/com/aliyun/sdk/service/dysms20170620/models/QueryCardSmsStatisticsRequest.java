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
 * {@link QueryCardSmsStatisticsRequest} extends {@link RequestModel}
 *
 * <p>QueryCardSmsStatisticsRequest</p>
 */
public class QueryCardSmsStatisticsRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmpName")
    private String tmpName;

    private QueryCardSmsStatisticsRequest(Builder builder) {
        super(builder);
        this.customTmpCode = builder.customTmpCode;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sendDateEnd = builder.sendDateEnd;
        this.sendDateStart = builder.sendDateStart;
        this.signName = builder.signName;
        this.tmpCode = builder.tmpCode;
        this.tmpName = builder.tmpName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsStatisticsRequest create() {
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

    /**
     * @return tmpName
     */
    public String getTmpName() {
        return this.tmpName;
    }

    public static final class Builder extends Request.Builder<QueryCardSmsStatisticsRequest, Builder> {
        private String customTmpCode; 
        private Long pageNo; 
        private Long pageSize; 
        private String sendDateEnd; 
        private String sendDateStart; 
        private String signName; 
        private String tmpCode; 
        private String tmpName; 

        private Builder() {
            super();
        } 

        private Builder(QueryCardSmsStatisticsRequest request) {
            super(request);
            this.customTmpCode = request.customTmpCode;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sendDateEnd = request.sendDateEnd;
            this.sendDateStart = request.sendDateStart;
            this.signName = request.signName;
            this.tmpCode = request.tmpCode;
            this.tmpName = request.tmpName;
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

        /**
         * TmpName.
         */
        public Builder tmpName(String tmpName) {
            this.putQueryParameter("TmpName", tmpName);
            this.tmpName = tmpName;
            return this;
        }

        @Override
        public QueryCardSmsStatisticsRequest build() {
            return new QueryCardSmsStatisticsRequest(this);
        } 

    } 

}
