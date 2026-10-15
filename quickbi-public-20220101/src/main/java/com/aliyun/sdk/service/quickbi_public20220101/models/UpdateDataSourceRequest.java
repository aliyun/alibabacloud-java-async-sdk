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
 * {@link UpdateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceRequest</p>
 */
public class UpdateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateModel;

    private UpdateDataSourceRequest(Builder builder) {
        super(builder);
        this.updateModel = builder.updateModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return updateModel
     */
    public String getUpdateModel() {
        return this.updateModel;
    }

    public static final class Builder extends Request.Builder<UpdateDataSourceRequest, Builder> {
        private String updateModel; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceRequest request) {
            super(request);
            this.updateModel = request.updateModel;
        } 

        /**
         * <p>A JSON-formatted string defining the data source configuration to update. See the example for the specific format. The JSON string includes the following parameters:</p>
         * <ul>
         * <li><p><code>dsId</code>: Required. The ID of the data source.</p>
         * </li>
         * <li><p><code>userId</code>: Optional. The Quick BI user ID of the user who modifies the data source. If you specify this parameter, the update runs as this user.</p>
         * </li>
         * <li><p><code>dsType</code>: Required. The type of the data source. This value cannot be changed and must match the existing data source type.</p>
         * </li>
         * <li><p><code>showName</code>: Optional. The display name of the data source.</p>
         * </li>
         * <li><p><code>address</code>: Optional. The database connection endpoint, which can be a domain name or an IP address.</p>
         * </li>
         * <li><p><code>port</code>: Optional. The connection port for the database.</p>
         * </li>
         * <li><p><code>schema</code>: Optional. The database schema. This parameter is required only for database types that support schemas. For example, the default schema for SQL Server is <code>dbo</code>, while MySQL does not use schemas.</p>
         * </li>
         * <li><p><code>instance</code>: Optional. The database instance.</p>
         * </li>
         * <li><p><code>username</code>: Optional. The username for the database account or the AccessKey ID.</p>
         * </li>
         * <li><p><code>password</code>: Optional. The password for the database account.</p>
         * </li>
         * <li><p><code>resource</code>: Specifies the VPC type. This parameter is required if you are using a VPC connection. If the data source was created with VPC settings, you must include this parameter in your update request. Omitting this parameter from the request disables the VPC connection. For a list of <code>resource</code> values, see the <strong>Additional information</strong> section below.</p>
         * </li>
         * <li><p><code>accessId</code>: Optional. The AccessKey ID for the VPC instance. This parameter is required if the <code>resource</code> parameter is specified.</p>
         * </li>
         * <li><p><code>accessKey</code>: Optional. The AccessKey secret for the VPC instance. This parameter is required if the <code>resource</code> parameter is specified.</p>
         * </li>
         * <li><p><code>instanceId</code>: Optional. The ID of the VPC instance. This parameter is required if the <code>resource</code> parameter is specified.</p>
         * </li>
         * <li><p><code>region</code>: Optional. The region where the VPC instance is located. This parameter is required if the <code>resource</code> parameter is specified. For a list of region IDs, see the <strong>Additional information</strong> section below.</p>
         * </li>
         * <li><p><code>config</code>: Optional. A JSON object that contains additional configuration parameters for the database. You only need to include the fields that you want to update. Any field that you include is updated to the new value, even if it is an empty string. Fields that are not included in the request remain unchanged.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;schema&quot;: &quot;schema&quot;,
         *     &quot;userId&quot;:&quot;S<em><strong><strong>46345&quot;,
         *     &quot;password&quot;: &quot;Ta</strong></strong>34&quot;,
         *     &quot;showName&quot;: &quot;test&quot;,
         *     &quot;address&quot;: &quot;11****</em>.55&quot;,
         *     &quot;instance&quot;: &quot;quickbi_test&quot;,
         *     &quot;dsId&quot;: &quot;34d6d******3ca8ac267&quot;,
         *     &quot;port&quot;: &quot;3306&quot;,
         *     &quot;dsType&quot;: &quot;mysql&quot;,
         *     &quot;username&quot;: &quot;root&quot;,
         *     &quot;config&quot;:  {
         *         &quot;initialSql&quot;: &quot;Set timezone = \&quot;-10\&quot;&quot;
         *     }
         * }</p>
         */
        public Builder updateModel(String updateModel) {
            this.putQueryParameter("UpdateModel", updateModel);
            this.updateModel = updateModel;
            return this;
        }

        @Override
        public UpdateDataSourceRequest build() {
            return new UpdateDataSourceRequest(this);
        } 

    } 

}
