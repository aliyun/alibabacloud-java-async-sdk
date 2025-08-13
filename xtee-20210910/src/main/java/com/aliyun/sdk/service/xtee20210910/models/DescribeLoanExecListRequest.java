// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeLoanExecListRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoanExecListRequest</p>
 */
public class DescribeLoanExecListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchNo")
    private String batchNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("monitorObj")
    private String monitorObj;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("monitorStatus")
    private String monitorStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeLoanExecListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.batchNo = builder.batchNo;
        this.currentPage = builder.currentPage;
        this.monitorObj = builder.monitorObj;
        this.monitorStatus = builder.monitorStatus;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoanExecListRequest create() {
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
     * @return batchNo
     */
    public String getBatchNo() {
        return this.batchNo;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return monitorObj
     */
    public String getMonitorObj() {
        return this.monitorObj;
    }

    /**
     * @return monitorStatus
     */
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeLoanExecListRequest, Builder> {
        private String lang; 
        private String batchNo; 
        private String currentPage; 
        private String monitorObj; 
        private String monitorStatus; 
        private String pageSize; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoanExecListRequest request) {
            super(request);
            this.lang = request.lang;
            this.batchNo = request.batchNo;
            this.currentPage = request.currentPage;
            this.monitorObj = request.monitorObj;
            this.monitorStatus = request.monitorStatus;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
        } 

        /**
         * <p>Set the language type for request and response messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Import batch number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder batchNo(String batchNo) {
            this.putQueryParameter("batchNo", batchNo);
            this.batchNo = batchNo;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Monitoring metric data.</p>
         * 
         * <strong>example:</strong>
         * <p>de_afghcf6411</p>
         */
        public Builder monitorObj(String monitorObj) {
            this.putQueryParameter("monitorObj", monitorObj);
            this.monitorObj = monitorObj;
            return this;
        }

        /**
         * <p>Status</p>
         * 
         * <strong>example:</strong>
         * <p>WAIT</p>
         */
        public Builder monitorStatus(String monitorStatus) {
            this.putQueryParameter("monitorStatus", monitorStatus);
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * <p>Page size, with a default value of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeLoanExecListRequest build() {
            return new DescribeLoanExecListRequest(this);
        } 

    } 

}
