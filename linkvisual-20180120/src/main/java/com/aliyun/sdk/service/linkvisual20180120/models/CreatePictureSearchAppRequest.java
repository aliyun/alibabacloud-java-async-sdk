// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link CreatePictureSearchAppRequest} extends {@link RequestModel}
 *
 * <p>CreatePictureSearchAppRequest</p>
 */
public class CreatePictureSearchAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreatePictureSearchAppRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePictureSearchAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreatePictureSearchAppRequest, Builder> {
        private String desc; 
        private String iotInstanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreatePictureSearchAppRequest request) {
            super(request);
            this.desc = request.desc;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
        } 

        /**
         * <p>The description of the image search application instance.</p>
         * <p>The description can contain Chinese characters, uppercase and lowercase English letters, digits, underscores (_), and hyphens (-). It can be up to 1,024 characters in length, and each Chinese character counts as two characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageSearchDemo</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console. If the instance has an ID, you must specify this ID. Otherwise, the call fails.</p>
         * <blockquote>
         * <p>If the public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
         * </blockquote>
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
         * <p>The name of the image search application instance. </p>
         * <p>The name can contain Chinese characters, uppercase and lowercase English letters, digits, underscores (_), and hyphens (-). It can be up to 64 characters in length, and each Chinese character counts as two characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageSearch</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreatePictureSearchAppRequest build() {
            return new CreatePictureSearchAppRequest(this);
        } 

    } 

}
