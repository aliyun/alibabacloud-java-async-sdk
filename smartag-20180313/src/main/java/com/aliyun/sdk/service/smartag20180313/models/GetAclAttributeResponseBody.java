// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link GetAclAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAclAttributeResponseBody</p>
 */
public class GetAclAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("AclName")
    private String aclName;

    @com.aliyun.core.annotation.NameInMap("ErrorConfigSmartAGCount")
    private Integer errorConfigSmartAGCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAclAttributeResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.errorConfigSmartAGCount = builder.errorConfigSmartAGCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAclAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return aclName
     */
    public String getAclName() {
        return this.aclName;
    }

    /**
     * @return errorConfigSmartAGCount
     */
    public Integer getErrorConfigSmartAGCount() {
        return this.errorConfigSmartAGCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aclId; 
        private String aclName; 
        private Integer errorConfigSmartAGCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAclAttributeResponseBody model) {
            this.aclId = model.aclId;
            this.aclName = model.aclName;
            this.errorConfigSmartAGCount = model.errorConfigSmartAGCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-xhwhyuo43l0n*****</p>
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The name of the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>dpi_test</p>
         */
        public Builder aclName(String aclName) {
            this.aclName = aclName;
            return this;
        }

        /**
         * <p>The number of SAG devices that are associated with the ACL who has DPI configuration errors.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/197566.html">ListDpiConfigError</a> operation to query exception details and SAG device information.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorConfigSmartAGCount(Integer errorConfigSmartAGCount) {
            this.errorConfigSmartAGCount = errorConfigSmartAGCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D2013F0-85AB-4332-9094-8023A598C2C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAclAttributeResponseBody build() {
            return new GetAclAttributeResponseBody(this);
        } 

    } 

}
