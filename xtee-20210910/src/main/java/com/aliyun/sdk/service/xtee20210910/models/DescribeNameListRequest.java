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
 * {@link DescribeNameListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNameListRequest</p>
 */
public class DescribeNameListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variableId")
    private String variableId;

    private DescribeNameListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.value = builder.value;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNameListRequest create() {
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
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return variableId
     */
    public String getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<DescribeNameListRequest, Builder> {
        private String lang; 
        private String createType; 
        private String currentPage; 
        private String pageSize; 
        private String regId; 
        private String value; 
        private String variableId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNameListRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.value = request.value;
            this.variableId = request.variableId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
         * <p>Creation type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
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
         * <p>Search value.</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("value", value);
            this.value = value;
            return this;
        }

        /**
         * <p>Variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393314</p>
         */
        public Builder variableId(String variableId) {
            this.putQueryParameter("variableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public DescribeNameListRequest build() {
            return new DescribeNameListRequest(this);
        } 

    } 

}
