// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link WebofficeUser} extends {@link TeaModel}
 *
 * <p>WebofficeUser</p>
 */
public class WebofficeUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private WebofficeUser(Builder builder) {
        this.avatar = builder.avatar;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebofficeUser create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String avatar; 
        private String id; 
        private String name; 

        private Builder() {
        } 

        private Builder(WebofficeUser model) {
            this.avatar = model.avatar;
            this.id = model.id;
            this.name = model.name;
        } 

        /**
         * <p>The custom URL of the avatar picture. The avatar picture is displayed on the WebOffice page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/?id=user1">http://example.com/?id=user1</a></p>
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * <p>The custom user ID. The user ID is displayed on the WebOffice page. A user ID can contain letters and digits and cannot exceed 15 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The custom username. The username is displayed on the WebOffice page. The username must meet the following requirements:</p>
         * <ul>
         * <li>A username can contain digits, letters, hyphens (-), underscores (_), plus signs (+), forward slashes (/), equal signs (=), and at signs (@).</li>
         * <li>A username can contain up to 32 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test-user1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public WebofficeUser build() {
            return new WebofficeUser(this);
        } 

    } 

}
