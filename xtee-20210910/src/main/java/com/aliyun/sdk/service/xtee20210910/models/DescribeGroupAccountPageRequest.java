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
 * {@link DescribeGroupAccountPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupAccountPageRequest</p>
 */
public class DescribeGroupAccountPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("communityNo")
    private String communityNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldKey")
    private String fieldKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldVal")
    private String fieldVal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isPage")
    private Boolean isPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private DescribeGroupAccountPageRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.communityNo = builder.communityNo;
        this.currentPage = builder.currentPage;
        this.direction = builder.direction;
        this.fieldKey = builder.fieldKey;
        this.fieldVal = builder.fieldVal;
        this.isPage = builder.isPage;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupAccountPageRequest create() {
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
     * @return communityNo
     */
    public String getCommunityNo() {
        return this.communityNo;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return fieldKey
     */
    public String getFieldKey() {
        return this.fieldKey;
    }

    /**
     * @return fieldVal
     */
    public String getFieldVal() {
        return this.fieldVal;
    }

    /**
     * @return isPage
     */
    public Boolean getIsPage() {
        return this.isPage;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeGroupAccountPageRequest, Builder> {
        private String lang; 
        private String communityNo; 
        private String currentPage; 
        private String direction; 
        private String fieldKey; 
        private String fieldVal; 
        private Boolean isPage; 
        private String order; 
        private String pageSize; 
        private String regId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupAccountPageRequest request) {
            super(request);
            this.lang = request.lang;
            this.communityNo = request.communityNo;
            this.currentPage = request.currentPage;
            this.direction = request.direction;
            this.fieldKey = request.fieldKey;
            this.fieldVal = request.fieldVal;
            this.isPage = request.isPage;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
         * <p>Community number.</p>
         * 
         * <strong>example:</strong>
         * <p>129838420210118141502KiJ1SZL2</p>
         */
        public Builder communityNo(String communityNo) {
            this.putQueryParameter("communityNo", communityNo);
            this.communityNo = communityNo;
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
         * <p>Order direction.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>fieldKey.</p>
         * 
         * <strong>example:</strong>
         * <p>mobile</p>
         */
        public Builder fieldKey(String fieldKey) {
            this.putQueryParameter("fieldKey", fieldKey);
            this.fieldKey = fieldKey;
            return this;
        }

        /**
         * <p>fieldVal.</p>
         * 
         * <strong>example:</strong>
         * <p>18000000000</p>
         */
        public Builder fieldVal(String fieldVal) {
            this.putQueryParameter("fieldVal", fieldVal);
            this.fieldVal = fieldVal;
            return this;
        }

        /**
         * <p>Whether to paginate.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isPage(Boolean isPage) {
            this.putQueryParameter("isPage", isPage);
            this.isPage = isPage;
            return this;
        }

        /**
         * <p>Sorting condition.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>Page size, default value is 10.</p>
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
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6770764</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeGroupAccountPageRequest build() {
            return new DescribeGroupAccountPageRequest(this);
        } 

    } 

}
