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
 * {@link DescribeSampleDataPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeSampleDataPageRequest</p>
 */
public class DescribeSampleDataPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataValue")
    private String dataValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateBeginTime")
    private Long updateBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateEndTime")
    private Long updateEndTime;

    private DescribeSampleDataPageRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.dataValue = builder.dataValue;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.updateBeginTime = builder.updateBeginTime;
        this.updateEndTime = builder.updateEndTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleDataPageRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataValue
     */
    public String getDataValue() {
        return this.dataValue;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return updateBeginTime
     */
    public Long getUpdateBeginTime() {
        return this.updateBeginTime;
    }

    /**
     * @return updateEndTime
     */
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

    public static final class Builder extends Request.Builder<DescribeSampleDataPageRequest, Builder> {
        private String lang; 
        private Integer currentPage; 
        private String dataValue; 
        private Integer pageSize; 
        private String regId; 
        private Long updateBeginTime; 
        private Long updateEndTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSampleDataPageRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.dataValue = request.dataValue;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.updateBeginTime = request.updateBeginTime;
            this.updateEndTime = request.updateEndTime;
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
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Content of the list entered in the text box</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000</p>
         */
        public Builder dataValue(String dataValue) {
            this.putQueryParameter("dataValue", dataValue);
            this.dataValue = dataValue;
            return this;
        }

        /**
         * <p>Page size, default value is 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
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

        /**
         * <p>Start time</p>
         * 
         * <strong>example:</strong>
         * <p>1730429469000</p>
         */
        public Builder updateBeginTime(Long updateBeginTime) {
            this.putQueryParameter("updateBeginTime", updateBeginTime);
            this.updateBeginTime = updateBeginTime;
            return this;
        }

        /**
         * <p>End time</p>
         * 
         * <strong>example:</strong>
         * <p>1730429469000</p>
         */
        public Builder updateEndTime(Long updateEndTime) {
            this.putQueryParameter("updateEndTime", updateEndTime);
            this.updateEndTime = updateEndTime;
            return this;
        }

        @Override
        public DescribeSampleDataPageRequest build() {
            return new DescribeSampleDataPageRequest(this);
        } 

    } 

}
