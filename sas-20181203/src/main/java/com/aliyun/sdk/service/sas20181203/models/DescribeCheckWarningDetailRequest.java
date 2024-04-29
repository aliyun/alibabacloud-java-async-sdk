// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningDetailRequest</p>
 */
public class DescribeCheckWarningDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private String checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckWarningId")
    private Long checkWarningId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeCheckWarningDetailRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.checkWarningId = builder.checkWarningId;
        this.lang = builder.lang;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sourceIp = builder.sourceIp;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return checkWarningId
     */
    public Long getCheckWarningId() {
        return this.checkWarningId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeCheckWarningDetailRequest, Builder> {
        private String checkId; 
        private Long checkWarningId; 
        private String lang; 
        private Long resourceDirectoryAccountId; 
        private String sourceIp; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckWarningDetailRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.checkWarningId = request.checkWarningId;
            this.lang = request.lang;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
            this.uuid = request.uuid;
        } 

        /**
         * The ID of the check item.
         * <p>
         * 
         * >  You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of check items.
         */
        public Builder checkId(String checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The ID of the alert that is triggered by the check item.
         * <p>
         * 
         * >  To query the details of a check item, you must provide the ID of the alert that is triggered by the check item. You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of alerts.
         */
        public Builder checkWarningId(Long checkWarningId) {
            this.putQueryParameter("CheckWarningId", checkWarningId);
            this.checkWarningId = checkWarningId;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the member in the resource directory.
         * <p>
         * 
         * >  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to query the IDs of Alibaba Cloud accounts.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The UUID of the server.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeCheckWarningDetailRequest build() {
            return new DescribeCheckWarningDetailRequest(this);
        } 

    } 

}
