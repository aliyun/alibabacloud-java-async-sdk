// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link SetDeviceGroupTagsRequest} extends {@link RequestModel}
 *
 * <p>SetDeviceGroupTagsRequest</p>
 */
public class SetDeviceGroupTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagString")
    private String tagString;

    private SetDeviceGroupTagsRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.iotInstanceId = builder.iotInstanceId;
        this.tagString = builder.tagString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeviceGroupTagsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return tagString
     */
    public String getTagString() {
        return this.tagString;
    }

    public static final class Builder extends Request.Builder<SetDeviceGroupTagsRequest, Builder> {
        private String groupId; 
        private String groupType; 
        private String iotInstanceId; 
        private String tagString; 

        private Builder() {
            super();
        } 

        private Builder(SetDeviceGroupTagsRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.iotInstanceId = request.iotInstanceId;
            this.tagString = request.tagString;
        } 

        /**
         * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>W16X8Tvdosec****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The type of the group.</p>
         * <p>You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>LINK_PLATFORM_DYNAMIC</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the <strong>ID</strong> of the instance.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The tag data in the JSON format. The TagString parameter specifies multiple tags in the format of key-value pairs. You must specify <strong>tagKey</strong> and <strong>tagValue</strong> for each tag.</p>
         * <ul>
         * <li><strong>tagKey</strong>: the tag key. The key must be 2 to 30 characters in length, and can contain letters, digits, and periods (.).</li>
         * <li><strong>tagValue</strong>: the tag value. Each value can contain letters, digits, underscores (_), and hyphens (-). The value must be 1 to 128 characters in length.</li>
         * </ul>
         * <p>Separate multiple tags with commas (,). Example: <code>[{&quot;tagKey&quot;:&quot;h1&quot;,&quot;tagValue&quot;:&quot;rr&quot;},{&quot;tagKey&quot;:&quot;7h&quot;,&quot;tagValue&quot;:&quot;rr&quot;}]</code></p>
         * <p>If you specify a new value for an existing tag, the new tag value overwrites the original value.</p>
         * <p>If you want to delete a tag, you do not need to specify the key and value for the tag.</p>
         * <p>**</p>
         * <p><strong>Important</strong> <code>abc</code> is a key that is reserved by IoT Platform. You cannot set <strong>tagKey</strong> to abc. If you set <code>tagKey</code> to abc, the abc tag is automatically filtered when you query tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;tagKey&quot;:&quot;h1&quot;,&quot;tagValue&quot;:&quot;rr&quot;},{&quot;tagKey&quot;:&quot;7h&quot;,&quot;tagValue&quot;:&quot;rr&quot;}]</p>
         */
        public Builder tagString(String tagString) {
            this.putQueryParameter("TagString", tagString);
            this.tagString = tagString;
            return this;
        }

        @Override
        public SetDeviceGroupTagsRequest build() {
            return new SetDeviceGroupTagsRequest(this);
        } 

    } 

}
