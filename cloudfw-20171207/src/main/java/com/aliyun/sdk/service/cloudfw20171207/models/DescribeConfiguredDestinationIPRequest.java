// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeConfiguredDestinationIPRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfiguredDestinationIPRequest</p>
 */
public class DescribeConfiguredDestinationIPRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationIP")
    private String destinationIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationISP")
    private String destinationISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegion")
    private String destinationRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeConfiguredDestinationIPRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.destinationIP = builder.destinationIP;
        this.destinationISP = builder.destinationISP;
        this.destinationRegion = builder.destinationRegion;
        this.direction = builder.direction;
        this.groupName = builder.groupName;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfiguredDestinationIPRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return destinationIP
     */
    public String getDestinationIP() {
        return this.destinationIP;
    }

    /**
     * @return destinationISP
     */
    public String getDestinationISP() {
        return this.destinationISP;
    }

    /**
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeConfiguredDestinationIPRequest, Builder> {
        private String currentPage; 
        private String destinationIP; 
        private String destinationISP; 
        private String destinationRegion; 
        private String direction; 
        private String groupName; 
        private String lang; 
        private String pageSize; 
        private String sourceCode; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfiguredDestinationIPRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.destinationIP = request.destinationIP;
            this.destinationISP = request.destinationISP;
            this.destinationRegion = request.destinationRegion;
            this.direction = request.direction;
            this.groupName = request.groupName;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DestinationIP.
         */
        public Builder destinationIP(String destinationIP) {
            this.putQueryParameter("DestinationIP", destinationIP);
            this.destinationIP = destinationIP;
            return this;
        }

        /**
         * DestinationISP.
         */
        public Builder destinationISP(String destinationISP) {
            this.putQueryParameter("DestinationISP", destinationISP);
            this.destinationISP = destinationISP;
            return this;
        }

        /**
         * DestinationRegion.
         */
        public Builder destinationRegion(String destinationRegion) {
            this.putQueryParameter("DestinationRegion", destinationRegion);
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
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
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun</p>
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeConfiguredDestinationIPRequest build() {
            return new DescribeConfiguredDestinationIPRequest(this);
        } 

    } 

}
