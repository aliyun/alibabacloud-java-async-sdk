// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListIspTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIspTypesResponseBody</p>
 */
public class ListIspTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IspTypeList")
    private java.util.List<String> ispTypeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIspTypesResponseBody(Builder builder) {
        this.ispTypeList = builder.ispTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIspTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ispTypeList
     */
    public java.util.List<String> getIspTypeList() {
        return this.ispTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> ispTypeList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListIspTypesResponseBody model) {
            this.ispTypeList = model.ispTypeList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The line types of EIPs in the acceleration region.</p>
         * <ul>
         * <li><strong>BGP</strong> (default): BGP (Multi-ISP) lines</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines</li>
         * </ul>
         * <p>If you have the permissions to use single-ISP bandwidth, one of the following values may be returned:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong>: China Telecom (single ISP)</li>
         * <li><strong>ChinaUnicom</strong>: China Unicom (single ISP)</li>
         * <li><strong>ChinaMobile</strong>: China Mobile (single ISP)</li>
         * <li><strong>ChinaTelecom_L2</strong>: China Telecom_L2 (single ISP)</li>
         * <li><strong>ChinaUnicom_L2</strong>: China Unicom_L2 (single ISP)</li>
         * <li><strong>ChinaMobile_L2</strong>: China Mobile_L2 (single ISP)</li>
         * </ul>
         * <blockquote>
         * <p>Different acceleration regions support different single-ISP BGP lines.</p>
         * </blockquote>
         */
        public Builder ispTypeList(java.util.List<String> ispTypeList) {
            this.ispTypeList = ispTypeList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F591955F-5CB5-4CCE-A75D-17CF2085CE22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIspTypesResponseBody build() {
            return new ListIspTypesResponseBody(this);
        } 

    } 

}
