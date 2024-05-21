// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPortalMenusResponseBody} extends {@link TeaModel}
 *
 * <p>ListPortalMenusResponseBody</p>
 */
public class ListPortalMenusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPortalMenusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPortalMenusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A JSON string that levels the details of the portal menu list. Valid values:
         * <p>
         * 
         * *   menuType: the type of the menu.
         * 
         *     *   0: dashboard
         *     *   1: outer chain
         *     *   2: workbook
         *     *   4: directory folder
         *     *   5: form filling
         *     *   6: self-service data retrieval
         * 
         * *   menuId: menu ID
         * 
         * *   uri: ID or URL of the resource associated with the menu
         * 
         * *   showOnlyWithAccess: Authorized Only Visible
         * 
         * *   menuName: menu display name
         * 
         * *   dependentPermisson: whether the report resource associated with the menu has permissions
         * 
         * *   children: submenu
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPortalMenusResponseBody build() {
            return new ListPortalMenusResponseBody(this);
        } 

    } 

}
