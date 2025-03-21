// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAlarmEventStackInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmEventStackInfoRequest</p>
 */
public class DescribeAlarmEventStackInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventName;

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
    @com.aliyun.core.annotation.NameInMap("UniqueInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniqueInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DescribeAlarmEventStackInfoRequest(Builder builder) {
        super(builder);
        this.eventName = builder.eventName;
        this.lang = builder.lang;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sourceIp = builder.sourceIp;
        this.uniqueInfo = builder.uniqueInfo;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventStackInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
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
     * @return uniqueInfo
     */
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeAlarmEventStackInfoRequest, Builder> {
        private String eventName; 
        private String lang; 
        private Long resourceDirectoryAccountId; 
        private String sourceIp; 
        private String uniqueInfo; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmEventStackInfoRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.lang = request.lang;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
            this.uniqueInfo = request.uniqueInfo;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The name of the event.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the names of events.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mining program</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the alert event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1fbe8d16727f61d1478a674d6fa0****</p>
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * <p>The UUID of the server to query.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18b7336e-d469-473b-af83-8e5420f9****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeAlarmEventStackInfoRequest build() {
            return new DescribeAlarmEventStackInfoRequest(this);
        } 

    } 

}
