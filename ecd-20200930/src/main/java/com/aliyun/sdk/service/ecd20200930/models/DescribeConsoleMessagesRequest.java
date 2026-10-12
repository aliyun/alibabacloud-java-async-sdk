// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeConsoleMessagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeConsoleMessagesRequest</p>
 */
public class DescribeConsoleMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientTypes")
    private java.util.List<String> clientTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageIds")
    private java.util.List<String> messageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageLevel")
    private String messageLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIds")
    private java.util.List<String> targetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private DescribeConsoleMessagesRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.clientTypes = builder.clientTypes;
        this.keyword = builder.keyword;
        this.messageIds = builder.messageIds;
        this.messageLevel = builder.messageLevel;
        this.messageType = builder.messageType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.targetIds = builder.targetIds;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsoleMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return clientTypes
     */
    public java.util.List<String> getClientTypes() {
        return this.clientTypes;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return messageIds
     */
    public java.util.List<String> getMessageIds() {
        return this.messageIds;
    }

    /**
     * @return messageLevel
     */
    public String getMessageLevel() {
        return this.messageLevel;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return targetIds
     */
    public java.util.List<String> getTargetIds() {
        return this.targetIds;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<DescribeConsoleMessagesRequest, Builder> {
        private String businessChannel; 
        private java.util.List<String> clientTypes; 
        private String keyword; 
        private java.util.List<String> messageIds; 
        private String messageLevel; 
        private String messageType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<String> targetIds; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConsoleMessagesRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.clientTypes = request.clientTypes;
            this.keyword = request.keyword;
            this.messageIds = request.messageIds;
            this.messageLevel = request.messageLevel;
            this.messageType = request.messageType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.targetIds = request.targetIds;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The business channel, which is used to limit the business to which the messages to query belong. Valid values: enterprise, standard, office, business, lincore_team, and AGENTIC_CLOUD_COMPUTER. The values are not case-sensitive. Default value: enterprise. Unrecognized channel values are also processed as enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The list of client types to which operational messages apply. A maximum of 100 items can be specified. Valid values: Windows (Windows client), Mac (macOS client), Web (web client), and Hardware (hardware terminal). For Mac, macOS is also supported. The matching is not case-sensitive. If multiple types are specified, a message is matched if it applies to any of the specified types. Do not pass duplicate types. To filter by client type, provide a non-empty list. If this parameter is not specified, messages are not filtered by client type. Do not specify this parameter when querying NOTIFICATION messages.</p>
         */
        public Builder clientTypes(java.util.List<String> clientTypes) {
            this.putQueryParameter("ClientTypes", clientTypes);
            this.clientTypes = clientTypes;
            return this;
        }

        /**
         * <p>The search keyword, which is used to perform a fuzzy match on the message title or body. A message is returned if either the title or the body matches the keyword. If this parameter is not specified or an empty string is passed, messages are not filtered by keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>System maintenance</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The list of message IDs to query. A maximum of 100 message IDs can be specified. If multiple IDs are specified, a message is matched if its ID matches any of the specified IDs. If this parameter is not specified or an empty list is passed, messages are not filtered by message ID. If no message ID matches, an empty list is returned.</p>
         */
        public Builder messageIds(java.util.List<String> messageIds) {
            this.putQueryParameter("MessageIds", messageIds);
            this.messageIds = messageIds;
            return this;
        }

        /**
         * <p>The message level filter condition for notification messages. Valid values: STRONG (strong message) and WEAK (weak message). The values are not case-sensitive. If this parameter is not specified or an unrecognized value is passed, messages are not filtered by message level. Do not specify this parameter when querying OPERATIONAL messages.</p>
         * 
         * <strong>example:</strong>
         * <p>STRONG</p>
         */
        public Builder messageLevel(String messageLevel) {
            this.putQueryParameter("MessageLevel", messageLevel);
            this.messageLevel = messageLevel;
            return this;
        }

        /**
         * <p>The message type. Valid values: OPERATIONAL (client operational message), WALLPAPER (desktop wallpaper text message), NOTIFICATION (message center notification), and CUSTOM_WALLPAPER (custom desktop wallpaper). The values are not case-sensitive. If this parameter is not specified or an unrecognized value is passed, messages are not filtered by message type.</p>
         * 
         * <strong>example:</strong>
         * <p>NOTIFICATION</p>
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * <p>The page number of the query result. Pages start from 1. Default value: 1. If the value is less than 1, it is processed as 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 200. Default value: 200. If the value is less than 1 or greater than 200, it is processed as 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of target IDs to match. A maximum of 100 items can be specified. To filter by target, provide a non-empty list and specify TargetType at the same time. Currently, only the first ID is used for Organization, EndUser, and AdUser. Queries for EndUser and AdUser also match messages targeted at the organization to which the user belongs and all users. Queries for Organization include messages for all convenience users and are compatible with fuzzy matching of organization IDs. Other target matching methods match based on the target ID, and the target type of the returned records is not guaranteed to be consistent with TargetType. Currently, Tag does not perform target ID filtering.</p>
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            this.putQueryParameter("TargetIds", targetIds);
            this.targetIds = targetIds;
            return this;
        }

        /**
         * <p>The target matching method. Valid values: AllUsers (all convenience users), EndUser (specified convenience user), Organization (convenience user organization), Desktop (cloud computer), ResourceGroup (resource group), Region (region), Tag (tag), AdAllUsers (all AD users), AdUser (specified AD user), and AdOrg (AD organization). The values are not case-sensitive. If TargetIds is specified, this parameter must also be specified. The target type in the query results is not guaranteed to be consistent with this parameter. If only this parameter is specified without target IDs, no target filtering is applied. Currently, Tag does not perform target filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>EndUser</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public DescribeConsoleMessagesRequest build() {
            return new DescribeConsoleMessagesRequest(this);
        } 

    } 

}
