// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListPortalMenusResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>75912036-5527-4B7E-9265-B481D6651AC2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A JSON string that levels the details of the portal menu list. Valid values:</p>
         * <ul>
         * <li><p>menuType: the type of the menu.</p>
         * <ul>
         * <li>0: dashboard</li>
         * <li>1: outer chain</li>
         * <li>2: workbook</li>
         * <li>4: directory folder</li>
         * <li>5: form filling</li>
         * <li>6: self-service data retrieval</li>
         * </ul>
         * </li>
         * <li><p>menuId: menu ID</p>
         * </li>
         * <li><p>uri: ID or URL of the resource associated with the menu</p>
         * </li>
         * <li><p>showOnlyWithAccess: Authorized Only Visible</p>
         * </li>
         * <li><p>menuName: menu display name</p>
         * </li>
         * <li><p>dependentPermisson: whether the report resource associated with the menu has permissions</p>
         * </li>
         * <li><p>children: submenu</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;children&quot;:[{&quot;children&quot;:[{&quot;children&quot;:[{&quot;menuId&quot;:&quot;54kqgoa****&quot;,&quot;menuName&quot;:&quot;Report menu&quot;,&quot;menuType&quot;:0,&quot;showOnlyWithAccess&quot;:true,&quot;dependentPermisson&quot;:false,&quot;uri&quot;:&quot;e5da4a3f-d7f9-4262-a39e-a840043c****&quot;},{**** &quot;menu1nId&quot;:&quot;pName&quot; 135 &quot;Directory menu&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:false,&quot;dependentPermisson&quot;:true}],&quot;menuId&quot;:&quot;23a7d5d8-e55a-4737-b6a1-3c585505****&quot;,&quot;menuName&quot;:&quot;pop level -3 menu&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:true,&quot;dependentPermisson&quot;:true}],&quot;menuId&quot;:&quot;80764 f3c-affd-45a1-aaa1-bb039d8a****&quot;,&quot;menuName&quot;:&quot;pop menu&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:false,&quot;dependentPermisson&quot;:true}],&quot;menuId&quot;:&quot;277 f968a-22 ff-4ce6-83f0-a82950f4****&quot;,&quot;menuName&quot;:&quot;pop menu&quot;,&quot;menuType&quot;:4,&quot;showOnlyWithAccess&quot;:false,&quot;dependentPermisson&quot;:true}]</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
