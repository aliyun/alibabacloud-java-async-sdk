// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link ListAttackTargetsRequest} extends {@link RequestModel}
 *
 * <p>ListAttackTargetsRequest</p>
 */
public class ListAttackTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstScanTimeEnd")
    private String firstScanTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstScanTimeStart")
    private String firstScanTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastScanStatus")
    private String lastScanStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastScanTimeEnd")
    private String lastScanTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastScanTimeStart")
    private String lastScanTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetName")
    private String targetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private ListAttackTargetsRequest(Builder builder) {
        super(builder);
        this.firstScanTimeEnd = builder.firstScanTimeEnd;
        this.firstScanTimeStart = builder.firstScanTimeStart;
        this.lastScanStatus = builder.lastScanStatus;
        this.lastScanTimeEnd = builder.lastScanTimeEnd;
        this.lastScanTimeStart = builder.lastScanTimeStart;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.provider = builder.provider;
        this.riskLevel = builder.riskLevel;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.targetName = builder.targetName;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttackTargetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firstScanTimeEnd
     */
    public String getFirstScanTimeEnd() {
        return this.firstScanTimeEnd;
    }

    /**
     * @return firstScanTimeStart
     */
    public String getFirstScanTimeStart() {
        return this.firstScanTimeStart;
    }

    /**
     * @return lastScanStatus
     */
    public String getLastScanStatus() {
        return this.lastScanStatus;
    }

    /**
     * @return lastScanTimeEnd
     */
    public String getLastScanTimeEnd() {
        return this.lastScanTimeEnd;
    }

    /**
     * @return lastScanTimeStart
     */
    public String getLastScanTimeStart() {
        return this.lastScanTimeStart;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListAttackTargetsRequest, Builder> {
        private String firstScanTimeEnd; 
        private String firstScanTimeStart; 
        private String lastScanStatus; 
        private String lastScanTimeEnd; 
        private String lastScanTimeStart; 
        private Long pageNumber; 
        private Long pageSize; 
        private String provider; 
        private String riskLevel; 
        private String sortField; 
        private String sortOrder; 
        private String targetName; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListAttackTargetsRequest request) {
            super(request);
            this.firstScanTimeEnd = request.firstScanTimeEnd;
            this.firstScanTimeStart = request.firstScanTimeStart;
            this.lastScanStatus = request.lastScanStatus;
            this.lastScanTimeEnd = request.lastScanTimeEnd;
            this.lastScanTimeStart = request.lastScanTimeStart;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.provider = request.provider;
            this.riskLevel = request.riskLevel;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.targetName = request.targetName;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The upper bound (inclusive) of the first scan time range. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        public Builder firstScanTimeEnd(String firstScanTimeEnd) {
            this.putQueryParameter("FirstScanTimeEnd", firstScanTimeEnd);
            this.firstScanTimeEnd = firstScanTimeEnd;
            return this;
        }

        /**
         * <p>The lower bound (inclusive) of the first scan time range. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        public Builder firstScanTimeStart(String firstScanTimeStart) {
            this.putQueryParameter("FirstScanTimeStart", firstScanTimeStart);
            this.firstScanTimeStart = firstScanTimeStart;
            return this;
        }

        /**
         * <p>Filters targets by the status of the most recent scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        public Builder lastScanStatus(String lastScanStatus) {
            this.putQueryParameter("LastScanStatus", lastScanStatus);
            this.lastScanStatus = lastScanStatus;
            return this;
        }

        /**
         * <p>The upper bound (inclusive) of the last scan time range. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        public Builder lastScanTimeEnd(String lastScanTimeEnd) {
            this.putQueryParameter("LastScanTimeEnd", lastScanTimeEnd);
            this.lastScanTimeEnd = lastScanTimeEnd;
            return this;
        }

        /**
         * <p>The lower bound (inclusive) of the last scan time range. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        public Builder lastScanTimeStart(String lastScanTimeStart) {
            this.putQueryParameter("LastScanTimeStart", lastScanTimeStart);
            this.lastScanTimeStart = lastScanTimeStart;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Values less than 1 are normalized to 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100. Values greater than 100 are clamped to 100. Values less than 1 return HTTP status code 400.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters targets by the exact business label of the model or agent provider. This parameter is decoupled from ConnectionMethod (technical protocol).</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>Filters targets by the risk level derived from the most recent completed scan task. Targets that have never been scanned do not have a risk level and are not matched by any value.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The field used for sorting. Only the following three aggregate fields are supported. Sorting is performed in memory. If this parameter is not specified, no additional sorting is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>lastScanTime</p>
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>The sort order. Targets with null aggregate values are always placed last regardless of the sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>Filters targets by name using fuzzy match (substring match). If this parameter is not specified, all targets are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Bailian</p>
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * <p>Filters targets by the exact scan target type.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListAttackTargetsRequest build() {
            return new ListAttackTargetsRequest(this);
        } 

    } 

}
