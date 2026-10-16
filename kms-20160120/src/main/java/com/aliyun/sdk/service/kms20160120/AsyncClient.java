// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.kms20160120.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For details about the access policies that must be granted to a RAM user or RAM role to invoke this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>This operation can be invoked through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: Access KMS using a public endpoint or a VPC endpoint. This method requires you to enable public network access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: Access KMS using a KMS private endpoint (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls through a shared gateway: The QPS limit for a single user is 200 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</li>
     * <li>Calls through a dedicated gateway: The QPS limit for a single user is determined by the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance data</a>.</li>
     * </ul>
     * <h3>Details</h3>
     * <p>Only asymmetric keys with <strong>Usage</strong> set to <strong>ENCRYPT/DECRYPT</strong> are supported. The following table lists the supported encryption algorithms:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Ciphertext length (bytes)</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * <td>Up to 6144</td>
     * </tr>
     * <tr>
     * <td>This topic provides an example of using an asymmetric key with key ID <code>key-hzz630494463ejqjx****</code> and key version ID <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> to decrypt the ciphertext <code>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</code> using the decryption algorithm <code>RSAES_OAEP_SHA_1</code>.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of AsymmetricDecrypt  AsymmetricDecryptRequest
     * @return AsymmetricDecryptResponse
     */
    CompletableFuture<AsymmetricDecryptResponse> asymmetricDecrypt(AsymmetricDecryptRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the permissions that are required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. To access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access a key in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway: The number of queries per second (QPS) for a single user is limited to 200. If the limit is exceeded, API calls are throttled. This may affect your business. We recommend that you plan your API calls to avoid exceeding this limit.</li>
     * <li>If you use a dedicated gateway: The QPS limit for a single user depends on the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys that have the <strong>Usage</strong> parameter set to <strong>ENCRYPT/DECRYPT</strong>. The following table describes the supported encryption algorithms.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum number of bytes that can be encrypted</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>190</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>214</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>318</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>342</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * <td>6047</td>
     * </tr>
     * <tr>
     * <td>In this example, the plaintext <code>SGVsbG8gd29ybGQ=</code> is encrypted using an asymmetric key with the key ID <code>key-hzz630494463ejqjx****</code>, the key version ID <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>, and the <code>RSAES_OAEP_SHA_1</code> encryption algorithm.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of AsymmetricEncrypt  AsymmetricEncryptRequest
     * @return AsymmetricEncryptResponse
     */
    CompletableFuture<AsymmetricEncryptResponse> asymmetricEncrypt(AsymmetricEncryptRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policies that are required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. This method requires you to enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Shared gateway: This operation is limited to 200 queries per second (QPS) for each user. If the limit is exceeded, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * <li>Dedicated gateway: The QPS for each user is limited by the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table describes the supported signature algorithms.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>EC_P256</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_P256K</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2DSA</td>
     * <td>SM2 elliptic curve digital signature algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>According to the GB/T 32918.2 standard &quot;Information security technology - SM2 elliptic curve public key cryptography - Part 2: Digital signature algorithm&quot;, when you calculate an SM2 signature, the value of the <strong>Digest</strong> parameter is not the SM3 hash value of the original message. Instead, the value is the SM3 hash value of the result of concatenating Z(A) and M. M is the original message to be signed. Z(A) is the hash value of user A, as defined in GB/T 32918.2.
     * This topic provides an example of how to use an asymmetric key with the key ID <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and the key version ID <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> to sign the digest <code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuy****=</code> using the <code>RSA_PSS_SHA_256</code> signature algorithm.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AsymmetricSign  AsymmetricSignRequest
     * @return AsymmetricSignResponse
     */
    CompletableFuture<AsymmetricSignResponse> asymmetricSign(AsymmetricSignRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or through a VPC. To access KMS over the Internet, you must enable the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access KMS instances over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway, the queries per second (QPS) limit for this operation is 200 for a single user. If you exceed this limit, API calls are throttled, which may impact your business. We recommend that you manage your call frequency to stay within the QPS limit.</li>
     * <li>If you use a dedicated gateway, the QPS limit for this operation for a single user is determined by the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table lists the supported signature algorithms.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>EC_P256</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_P256K</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2DSA</td>
     * <td>SM2 elliptic curve digital signature algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>In accordance with the GBT32918 standard, when an SM2 signature is calculated, the value of the <strong>Digest</strong> parameter is not the SM3 hash value of the original message. Instead, the value is the SM3 hash value of the result generated by concatenating Z(A) and M. In this formula, M is the original message to be signed, and Z(A) is the hash value of user A as defined in GBT32918.
     * This topic provides an example of how to use an asymmetric key with the key ID \<code>5c438b18-05be-40ad-b6c2-3be6752c\\*\\*\\*\\*\\</code> and the key version ID \<code>2ab1a983-7072-4bbc-a582-584b5bd8\\*\\*\\*\\*\\</code> to verify the signature \<code>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq\\*\\*\\*\\*==\\</code> for the digest \<code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=\\</code> using the RSA_PSS_SHA_256 signature algorithm.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AsymmetricVerify  AsymmetricVerifyRequest
     * @return AsymmetricVerifyResponse
     */
    CompletableFuture<AsymmetricVerifyResponse> asymmetricVerify(AsymmetricVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the access policy required for a Resource Access Management (RAM) user or RAM role to invoke this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>If you do not specify a version number or version stage, KMS returns the secret value of the version marked as ACSCurrent by default.</li>
     * <li>The caller must have the <code>kms:GetSecretValue</code> permission on all secrets in the batch.</li>
     * <li>If a secret uses a customer master key to protect the secret value, the caller must also have the <code>kms:Decrypt</code> permission on the corresponding master key.
     * This topic provides an example of how to retrieve the secret value of a secret named <code>secret001</code>. The response shows that the secret value <code>SecretData</code> is <code>testdata1</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchGetSecretValue  BatchGetSecretValueRequest
     * @return BatchGetSecretValueResponse
     */
    CompletableFuture<BatchGetSecretValueResponse> batchGetSecretValue(BatchGetSecretValueRequest request);

    /**
     * <b>description</b> :
     * <p>If the deletion task of a CMK is canceled, the CMK returns to the Enabled state.</p>
     * 
     * @param request the request parameters of CancelKeyDeletion  CancelKeyDeletionRequest
     * @return CancelKeyDeletionResponse
     */
    CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletion(CancelKeyDeletionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>You can enable only instances of the software key management type. You cannot enable instances of the hardware key management type.</p>
     * 
     * @param request the request parameters of ConnectKmsInstance  ConnectKmsInstanceRequest
     * @return ConnectKmsInstanceResponse
     */
    CompletableFuture<ConnectKmsInstanceResponse> connectKmsInstance(ConnectKmsInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  Each alias can be bound to only one CMK at a time.</p>
     * <ul>
     * <li>The aliases of CMKs in the same region must be unique.
     * In this topic, an alias named <code>alias/example</code> is created for a CMK named <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAlias  CreateAliasRequest
     * @return CreateAliasResponse
     */
    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based AAP:
     * 1.Create a network access rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access KMS. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind network access rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. This topic describes how to create an AAP.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * @param request the request parameters of CreateApplicationAccessPoint  CreateApplicationAccessPointRequest
     * @return CreateApplicationAccessPointResponse
     */
    CompletableFuture<CreateApplicationAccessPointResponse> createApplicationAccessPoint(CreateApplicationAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP.</p>
     * <h3>Precautions</h3>
     * <p>A client key has a validity period. After a client key expires, applications into which the client key is integrated cannot access the required KMS instance. You must replace the client key before the client key expires. We recommend that you delete the expired client key in KMS after the new client key is used.</p>
     * 
     * @param request the request parameters of CreateClientKey  CreateClientKeyRequest
     * @return CreateClientKeyResponse
     */
    CompletableFuture<CreateClientKeyResponse> createClientKey(CreateClientKeyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policies required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Alibaba Cloud Key Management Service (KMS) supports common specifications for symmetric and asymmetric keys. For more information, see <a href="https://help.aliyun.com/document_detail/480161.html">Key management types and key specifications</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKey  CreateKeyRequest
     * @return CreateKeyResponse
     */
    CompletableFuture<CreateKeyResponse> createKey(CreateKeyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation to create an asymmetric CMK and the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status of the CMK. The status is specified by the KeyState parameter.</li>
     * <li>The minimum interval for creating a version of the same CMK is seven days. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.</li>
     * <li>If a CMK is in a private key store, you cannot create a version for the CMK.</li>
     * <li>You can create a maximum of 50 versions for a CMK in the same region.
     * You can create a version for the CMK whose ID is <code>0b30658a-ed1a-4922-b8f7-a673ca9c****</code> by using the parameter settings provided in this topic.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKeyVersion  CreateKeyVersionRequest
     * @return CreateKeyVersionResponse
     */
    CompletableFuture<CreateKeyVersionResponse> createKeyVersion(CreateKeyVersionRequest request);

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a KMS instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * @param request the request parameters of CreateNetworkRule  CreateNetworkRuleRequest
     * @return CreateNetworkRuleResponse
     */
    CompletableFuture<CreateNetworkRuleResponse> createNetworkRule(CreateNetworkRuleRequest request);

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the access policy that must be granted to a Resource Access Management (RAM) user or RAM role to invoke this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>You must specify the secret name, the secret value of the initial version, and the version ID. The status of the initial version is marked as ACSCurrent.</li>
     * <li>Key Management Service (KMS) uses the specified key to encrypt and protect the secret value. The key and the secret must belong to the same KMS instance, and the key must be a symmetric key.<blockquote>
     * <p>KMS encrypts the secret value of each version. Metadata such as the secret name, version ID, and version status tags are not encrypted.</p>
     * </blockquote>
     * </li>
     * <li>Before you encrypt the secret value, you must have the <code>kms:GenerateDataKey</code> permission on the key.
     * This topic provides an example of creating an ApsaraDB RDS secret named <code>mydbconninfo</code> with the initial version ID <code>VersionId</code> set to <code>v1</code> and the secret value <code>SecretData</code> set to <code>{&quot;Accounts&quot;:[{&quot;AccountName&quot;:&quot;user1&quot;,&quot;AccountPassword&quot;:&quot;****&quot;}]}</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For details about the access policies that Resource Access Management (RAM) users or RAM roles need to invoke this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>This operation can be invoked through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: Access KMS through public network access or a VPC endpoint. This method requires you to enable the public network switch. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls through a shared gateway: The QPS limit for a single user is 1,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</li>
     * <li>Calls through a dedicated gateway: The QPS limit for a single user is based on the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance data</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of Decrypt  DecryptRequest
     * @return DecryptResponse
     */
    CompletableFuture<DecryptResponse> decrypt(DecryptRequest request);

    /**
     * @param request the request parameters of DeleteAlias  DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role requires to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before you delete an AAP, make sure that it is no longer in use. If you delete an AAP that is in use, related applications cannot access KMS. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApplicationAccessPoint  DeleteApplicationAccessPointRequest
     * @return DeleteApplicationAccessPointResponse
     */
    CompletableFuture<DeleteApplicationAccessPointResponse> deleteApplicationAccessPoint(DeleteApplicationAccessPointRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before you delete a ClientKey, make sure that it is no longer in use. Deleting a ClientKey that is in use prevents related applications from accessing KMS. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteClientKey  DeleteClientKeyRequest
     * @return DeleteClientKeyResponse
     */
    CompletableFuture<DeleteClientKeyResponse> deleteClientKey(DeleteClientKeyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation does not delete the CMK that is created by using the key material.
     * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
     * After you delete the key material, you can upload only the same key material into the CMK.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of DeleteKeyMaterial  DeleteKeyMaterialRequest
     * @return DeleteKeyMaterialResponse
     */
    CompletableFuture<DeleteKeyMaterialResponse> deleteKeyMaterial(DeleteKeyMaterialRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that is required to call this OpenAPI as a Resource Access Management (RAM) user or RAM role, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before deleting the network control rule, ensure that it is not attached to any access policies. Otherwise, related applications cannot access KMS as expected.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteNetworkRule  DeleteNetworkRuleRequest
     * @return DeleteNetworkRuleResponse
     */
    CompletableFuture<DeleteNetworkRuleResponse> deleteNetworkRule(DeleteNetworkRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a permission policy, make sure that the permission policy is not associated with application access points (AAPs). Otherwise, related applications cannot access Key Management Service (KMS).</p>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation without specifying a recovery period, the deleted secret can be recovered within 30 days.
     * If you specify a recovery period, the deleted secret can be recovered within the recovery period. You can also forcibly delete a secret. A forcibly deleted secret cannot be recovered.</p>
     * 
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of DescribeAccountKmsStatus  DescribeAccountKmsStatusRequest
     * @return DescribeAccountKmsStatusResponse
     */
    CompletableFuture<DescribeAccountKmsStatusResponse> describeAccountKmsStatus(DescribeAccountKmsStatusRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the access policy that a Resource Access Management (RAM) user or RAM role must have to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of DescribeApplicationAccessPoint  DescribeApplicationAccessPointRequest
     * @return DescribeApplicationAccessPointResponse
     */
    CompletableFuture<DescribeApplicationAccessPointResponse> describeApplicationAccessPoint(DescribeApplicationAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the information about the CMK <code>05754286-3ba2-4fa6-8d41-4323aca6****</code> by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of DescribeKey  DescribeKeyRequest
     * @return DescribeKeyResponse
     */
    CompletableFuture<DescribeKeyResponse> describeKey(DescribeKeyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about a version of the CMK <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The ID of the CMK version is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>. The response shows that the creation time of the CMK version is <code>2016-03-25T10:42:40Z</code>.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of DescribeKeyVersion  DescribeKeyVersionRequest
     * @return DescribeKeyVersionResponse
     */
    CompletableFuture<DescribeKeyVersionResponse> describeKeyVersion(DescribeKeyVersionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the required access policy for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of DescribeNetworkRule  DescribeNetworkRuleRequest
     * @return DescribeNetworkRuleResponse
     */
    CompletableFuture<DescribeNetworkRuleResponse> describeNetworkRule(DescribeNetworkRuleRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of DescribePolicy  DescribePolicyRequest
     * @return DescribePolicyResponse
     */
    CompletableFuture<DescribePolicyResponse> describePolicy(DescribePolicyRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns the metadata of a secret. This operation does not return the secret value.
     * In this example, the metadata of the secret named <code>secret001</code> is queried.</p>
     * 
     * @param request the request parameters of DescribeSecret  DescribeSecretRequest
     * @return DescribeSecretResponse
     */
    CompletableFuture<DescribeSecretResponse> describeSecret(DescribeSecretRequest request);

    /**
     * <b>description</b> :
     * <p>If a customer master key (CMK) is disabled, the ciphertext encrypted by using this CMK cannot be decrypted until you re-enable it. You can call the <a href="https://help.aliyun.com/document_detail/35150.html">EnableKey</a> operation to enable the CMK.
     * In this example, the CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code> is disabled.</p>
     * 
     * @param request the request parameters of DisableKey  DisableKeyRequest
     * @return DisableKeyResponse
     */
    CompletableFuture<DisableKeyResponse> disableKey(DisableKeyRequest request);

    /**
     * @param request the request parameters of EnableKey  EnableKeyRequest
     * @return EnableKeyResponse
     */
    CompletableFuture<EnableKeyResponse> enableKey(EnableKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required to allow a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To use this method, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>When accessed through a shared gateway, the queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, requests are throttled, which can affect your business. We recommend that you stay within this limit to avoid throttling.</li>
     * <li>When accessed through a dedicated gateway, the QPS limit for a single user is subject to the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <ul>
     * <li>KMS encrypts the specified data using the primary version of a specified key.</li>
     * <li>You can encrypt a maximum of 6 KB of data, such as an RSA key, a database password, or other sensitive information.</li>
     * <li>If you migrate encrypted data from one region to another, you can call the Encrypt operation in the destination region to re-encrypt the plaintext data key from the source region. This generates a new encrypted data key. You can then call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt this new key in the destination region.</li>
     * </ul>
     * 
     * @param request the request parameters of Encrypt  EncryptRequest
     * @return EncryptResponse
     */
    CompletableFuture<EncryptResponse> encrypt(EncryptRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS using the public endpoint or a VPC endpoint. To use the public endpoint, you must first enable it. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access the key in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of the KMS instance: <code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation to obtain a data key encrypted by a master key (CMK), you can use the ExportDataKey operation to distribute the data key to other regions or cryptographic modules. The ExportDataKey operation returns the ciphertext of the data key, re-encrypted with the specified public key.
     * You can import the exported ciphertext into the cryptographic module that holds the corresponding private key. This process lets you securely distribute the data key from KMS to a cryptographic module. After the data key is imported into the cryptographic module, you can use it to encrypt or decrypt data.</p>
     * 
     * @param request the request parameters of ExportDataKey  ExportDataKeyRequest
     * @return ExportDataKeyResponse
     */
    CompletableFuture<ExportDataKeyResponse> exportDataKey(ExportDataKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Notes</h3>
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access KMS instances over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>We recommend that you import the data key to a cryptographic module for data encryption and data decryption as follows:
     * 1\. Call the GenerateAndExportDataKey operation to obtain the data key encrypted by a KMS key and a specified public key.
     * 2\. Save the ciphertext of the data key that is encrypted by the KMS key to KMS or a storage service, such as ApsaraDB, for key backup and recovery.
     * 3\. Import the ciphertext of the data key that is encrypted by the public key to the cryptographic module that contains the corresponding private key. This process distributes the key from KMS to the cryptographic module. You can then use the data key to encrypt and decrypt data.</p>
     * <blockquote>
     * <p>The KMS key that you specify in the request is used only to encrypt the data key and is not used to generate the data key. KMS does not record or store the randomly generated data key. You are responsible for recording the data key or its ciphertext.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateAndExportDataKey  GenerateAndExportDataKeyRequest
     * @return GenerateAndExportDataKeyResponse
     */
    CompletableFuture<GenerateAndExportDataKeyResponse> generateAndExportDataKey(GenerateAndExportDataKeyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the access policies that must be granted to a Resource Access Management (RAM) user or RAM role to invoke this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>You can invoke this operation through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: Access KMS over the Internet or through a VPC endpoint. This method requires that you enable public network access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: Access KMS through the KMS private endpoint (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls through a shared gateway: The QPS limit for a single user is 1,000 calls per second. If you exceed this limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</li>
     * <li>Calls through a dedicated gateway: The QPS limit for a single user is determined by the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance data</a>.</li>
     * </ul>
     * <h3>Details</h3>
     * <p>This operation generates a random data key (DK), encrypts it by using the customer master key (CMK) that you specify, and returns both the plaintext and ciphertext of the DK. Use the plaintext DK to encrypt data locally outside of KMS. When you store the encrypted data, also store the ciphertext of the DK. You can retrieve the plaintext DK from the Plaintext field and the ciphertext DK from the CiphertextBlob field in the response.
     * The CMK specified in the request is used only to encrypt the DK and has no effect on DK generation. KMS does not record or store the randomly generated DK. You are responsible for persisting the DK ciphertext.
     * Use the following procedure to encrypt data locally:</p>
     * <ol>
     * <li>Invoke the GenerateDataKey operation to obtain a DK for data encryption.</li>
     * <li>Use the plaintext DK (returned in the Plaintext field of the response) to encrypt data locally, then purge the plaintext DK from memory.</li>
     * <li>Store the DK ciphertext (returned in the CiphertextBlob field of the response) together with the locally encrypted data.
     * To decrypt data locally:</li>
     * </ol>
     * <ul>
     * <li>Invoke the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the locally stored DK ciphertext. This operation returns the plaintext DK.</li>
     * <li>Use the plaintext DK to decrypt data locally, then purge the plaintext DK from memory.
     * This topic provides an example of generating a random DK for the key with the ID <code>key-hzz630494463ejqjx****</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateDataKey  GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     */
    CompletableFuture<GenerateDataKeyResponse> generateDataKey(GenerateDataKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role needs to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: Access KMS over the Internet or through a VPC domain name. This method requires Internet access to be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls through a shared gateway: The queries per second (QPS) limit for a single user is 1,000. If you exceed this limit, requests are throttled, which may affect your business. We recommend that you stay within this limit.</li>
     * <li>Calls through a dedicated gateway: The QPS limit for a single user depends on the computing performance of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Details</h3>
     * <p>This operation generates a random data key, encrypts it with a specified symmetric customer master key (CMK), and returns the ciphertext of the data key. This operation provides the same features as <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>. The only difference is that this operation does not return the plaintext of the data key.
     * The CMK that you specify in the request is used only to encrypt the data key. It is not used to generate the data key. KMS does not record or store the randomly generated data key.</p>
     * <blockquote>
     * <ul>
     * <li><p>This operation is suitable for systems that do not need to immediately use the data key for data encryption. When encryption is required, the system calls the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> API to decrypt the ciphertext of the data key.</p>
     * </li>
     * <li><p>This operation is also suitable for distributed systems with different trust levels. For example, your system stores data in different partitions based on a defined policy. A module pre-creates these data partitions and generates a unique data key for each one. After this module initializes the control plane, it acts as a key distributor and does not produce or consume data. When data plane modules produce and consume data, they first retrieve the ciphertext of the data key for a partition. They then decrypt the ciphertext and use the plaintext data key to encrypt or decrypt data. Finally, they purge the plaintext data key from memory. In such a system, the key distributor does not need to access the plaintext of the data key. It only requires the \<code>GenerateDataKeyWithoutPlaintext\\</code> permission for the relevant CMK. Data producers and consumers do not need to generate new data keys. They only require the \<code>Decrypt\\</code> permission for the relevant CMK.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateDataKeyWithoutPlaintext  GenerateDataKeyWithoutPlaintextRequest
     * @return GenerateDataKeyWithoutPlaintextResponse
     */
    CompletableFuture<GenerateDataKeyWithoutPlaintextResponse> generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request);

    /**
     * <b>description</b> :
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through a shared gateway or a dedicated gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through a public or VPC endpoint. This method requires you to enable the public network access switch. For more information, refer to accessing keys in a KMS instance over the Internet.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<YOUR_KMS_INSTANCE_ID>.cryptoservice.kms.aliyuncs.com).</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateMac  GenerateMacRequest
     * @return GenerateMacResponse
     */
    CompletableFuture<GenerateMacResponse> generateMac(GenerateMacRequest request);

    /**
     * @param request the request parameters of GetChallenge  GetChallengeRequest
     * @return GetChallengeResponse
     */
    CompletableFuture<GetChallengeResponse> getChallenge(GetChallengeRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of GetClientKey  GetClientKeyRequest
     * @return GetClientKeyResponse
     */
    CompletableFuture<GetClientKeyResponse> getClientKey(GetClientKeyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that is required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This API is for users who migrate from KMS 1.0 to KMS 3.0. After the migration is complete, if you create an Asset without specifying a KMS instance, the Asset is created in the default KMS instance.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDefaultKmsInstance  GetDefaultKmsInstanceRequest
     * @return GetDefaultKmsInstanceResponse
     */
    CompletableFuture<GetDefaultKmsInstanceResponse> getDefaultKmsInstance(GetDefaultKmsInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Because the key policy name can only be set to default, you must set the PolicyName parameter to default when you query the key policy. Otherwise, a <code>Not Found</code> error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GetKeyPolicy  GetKeyPolicyRequest
     * @return GetKeyPolicyResponse
     */
    CompletableFuture<GetKeyPolicyResponse> getKeyPolicy(GetKeyPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Refer to <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a> for the access policy required to call this OpenAPI as a RAM user or RAM role.</p>
     * 
     * @param request the request parameters of GetKmsInstance  GetKmsInstanceRequest
     * @return GetKmsInstanceResponse
     */
    CompletableFuture<GetKmsInstanceResponse> getKmsInstance(GetKmsInstanceRequest request);

    /**
     * @param request the request parameters of GetKmsInstanceQuotaInfos  GetKmsInstanceQuotaInfosRequest
     * @return GetKmsInstanceQuotaInfosResponse
     */
    CompletableFuture<GetKmsInstanceQuotaInfosResponse> getKmsInstanceQuotaInfos(GetKmsInstanceQuotaInfosRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the access policy that must be granted to a RAM user or RAM role to call this operation, refer to access control.
     * This operation can be called through a shared gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through public or VPC endpoints.</li>
     * </ul>
     * 
     * @param request the request parameters of GetManagedDataKey  GetManagedDataKeyRequest
     * @return GetManagedDataKeyResponse
     */
    CompletableFuture<GetManagedDataKeyResponse> getManagedDataKey(GetManagedDataKeyRequest request);

    /**
     * <b>description</b> :
     * <p>The returned parameters can be used to call the <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/importkeymaterial">ImportKeyMaterial</a> operation.</p>
     * <ul>
     * <li>You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.</li>
     * <li>The public key and token that are returned by the GetParametersForImport operation must be used together. The public key and token can be used to import key material only for the CMK that is specified when you call the operation.</li>
     * <li>The public key and token that are returned vary each time you call the GetParametersForImport operation.</li>
     * <li>You must specify the type of the public key and the encryption algorithm that are used to encrypt key material. The following table lists the types of public keys and the encryption algorithms allowed for each type.   <table>
     * <thead>
     * <tr>
     * <th>Public key type</th>
     * <th>Encryption algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_PKCS1_V1_5</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>CMKs of all regions and all protection levels are supported.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dedicated Key Management Service (KMS) does not support RSAES_OAEP_SHA_1.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>CMKs whose ProtectionLevel is set to HSM are supported. The SM2 algorithm is developed and approved by the State Cryptography Administration of China. The SM2 algorithm can be used only to import key material for a CMK whose ProtectionLevel is set to HSM. You can use the SM2 algorithm only when you enable the Managed HSM feature for KMS in the Chinese mainland. For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/managed-hsm-overview">Overview of Managed HSM</a>.</td>
     * </tr>
     * <tr>
     * <td>For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/import-key-material">Import key material</a>. This topic provides an example on how to query the parameters that are used to import key material for a CMK. The ID of the CMK is <code>1234abcd-12ab-34cd-56ef-12345678****</code>, the encryption algorithm is <code>RSAES_PKCS1_V1_5</code>, and the public key is of the <code>RSA_2048</code> type. The parameters that are returned include the ID of the CMK, the public key that is used to encrypt the key material, the token that is used to import the key material, and the time when the token expires.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetParametersForImport  GetParametersForImportRequest
     * @return GetParametersForImportResponse
     */
    CompletableFuture<GetParametersForImportResponse> getParametersForImport(GetParametersForImportRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports both shared gateways and dedicated gateways. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. If you access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetPublicKey  GetPublicKeyRequest
     * @return GetPublicKeyResponse
     */
    CompletableFuture<GetPublicKeyResponse> getPublicKey(GetPublicKeyRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of GetRandomPassword  GetRandomPasswordRequest
     * @return GetRandomPasswordResponse
     */
    CompletableFuture<GetRandomPasswordResponse> getRandomPassword(GetRandomPasswordRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>A credential policy name can be set only to default. Therefore, you must set the PolicyName parameter to default when you query the credential policy. Otherwise, a <code>Not Found</code> error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSecretPolicy  GetSecretPolicyRequest
     * @return GetSecretPolicyResponse
     */
    CompletableFuture<GetSecretPolicyResponse> getSecretPolicy(GetSecretPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the access policy that needs to be granted to a Resource Access Management (RAM) user or RAM role to invoke this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>If you do not specify a version number or version status, KMS returns the credential value of the version marked as ACSCurrent by default.</li>
     * <li>If the credential uses a custom master key to protect the credential value, the caller must also have the <code>kms:Decrypt</code> permission on the corresponding master key.
     * This topic provides an example of retrieving the credential value of a credential named <code>secret001</code>. The response shows that the credential value <code>SecretData</code> is <code>testdata1</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSecretValue  GetSecretValueRequest
     * @return GetSecretValueResponse
     */
    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    /**
     * <b>description</b> :
     * <p>When you call <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> to create a CMK, you can set <strong>Origin</strong> to <strong>EXTERNAL</strong> to specify that the key material comes from an external source. Use this operation to import the key material into such a CMK.</p>
     * <ul>
     * <li>To view the CMK <strong>Origin</strong>, see <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a>.</li>
     * <li>Before importing key material, call <a href="https://help.aliyun.com/document_detail/68621.html">GetParametersForImport</a> to obtain the parameters required for the import, including the public key and import token.<blockquote>
     * <ul>
     * <li><p>For a CMK of type <strong>Aliyun_AES_256</strong>, the key material must be 256 bits. For a CMK of type <strong>Aliyun_SM4</strong>, the key material must be 128 bits.</p>
     * </li>
     * <li><p>You can set the expiration time for the key material, or you can set it to never expire.</p>
     * </li>
     * <li><p>You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.</p>
     * </li>
     * <li><p>After the imported key material expires or is deleted, the specified CMK becomes unavailable until the same key material is imported again.</p>
     * </li>
     * <li><p>The same key material can be imported into multiple CMKs, but data or data keys encrypted by one CMK cannot be decrypted by another CMK.
     * For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ImportKeyMaterial  ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     */
    CompletableFuture<ImportKeyMaterialResponse> importKeyMaterial(ImportKeyMaterialRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListAliases  ListAliasesRequest
     * @return ListAliasesResponse
     */
    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    /**
     * @param request the request parameters of ListAliasesByKeyId  ListAliasesByKeyIdRequest
     * @return ListAliasesByKeyIdResponse
     */
    CompletableFuture<ListAliasesByKeyIdResponse> listAliasesByKeyId(ListAliasesByKeyIdRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListApplicationAccessPoints  ListApplicationAccessPointsRequest
     * @return ListApplicationAccessPointsResponse
     */
    CompletableFuture<ListApplicationAccessPointsResponse> listApplicationAccessPoints(ListApplicationAccessPointsRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListClientKeys  ListClientKeysRequest
     * @return ListClientKeysResponse
     */
    CompletableFuture<ListClientKeysResponse> listClientKeys(ListClientKeysRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListKeyVersions  ListKeyVersionsRequest
     * @return ListKeyVersionsResponse
     */
    CompletableFuture<ListKeyVersionsResponse> listKeyVersions(ListKeyVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListKeys  ListKeysRequest
     * @return ListKeysResponse
     */
    CompletableFuture<ListKeysResponse> listKeys(ListKeysRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListKmsInstances  ListKmsInstancesRequest
     * @return ListKmsInstancesResponse
     */
    CompletableFuture<ListKmsInstancesResponse> listKmsInstances(ListKmsInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through the shared gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through public or VPC endpoints.</li>
     * </ul>
     * 
     * @param request the request parameters of ListManagedDataKeyVersions  ListManagedDataKeyVersionsRequest
     * @return ListManagedDataKeyVersionsResponse
     */
    CompletableFuture<ListManagedDataKeyVersionsResponse> listManagedDataKeyVersions(ListManagedDataKeyVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListNetworkRules  ListNetworkRulesRequest
     * @return ListNetworkRulesResponse
     */
    CompletableFuture<ListNetworkRulesResponse> listNetworkRules(ListNetworkRulesRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>Request format: KeyId=&quot;string&quot;</p>
     * 
     * @param request the request parameters of ListResourceTags  ListResourceTagsRequest
     * @return ListResourceTagsResponse
     */
    CompletableFuture<ListResourceTagsResponse> listResourceTags(ListResourceTagsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the access policy required for a Resource Access Management (RAM) user or RAM role to invoke this operation, refer to <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>Version information does not include secret values. By default, only secret versions that have version stages are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSecretVersionIds  ListSecretVersionIdsRequest
     * @return ListSecretVersionIdsResponse
     */
    CompletableFuture<ListSecretVersionIdsResponse> listSecretVersionIds(ListSecretVersionIdsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>To call this operation, the RAM user or RAM role must be granted the required policy. For more information, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation returns only secret metadata, not the secret values.
     * This example shows how to query secrets created by the current user in the current region. <code>PageNumber</code> is set to <code>1</code> and <code>PageSize</code> is set to <code>2</code>, returning metadata for two secrets.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSecrets  ListSecretsRequest
     * @return ListSecretsResponse
     */
    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policies that a RAM user or RAM role needs to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>KMS is a paid service. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52608.html">Billing</a>.</li>
     * <li>You can activate the service for an Alibaba Cloud account only once.</li>
     * <li>Make sure that your Alibaba Cloud account has completed real-name verification.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenKmsService  OpenKmsServiceRequest
     * @return OpenKmsServiceResponse
     */
    CompletableFuture<OpenKmsServiceResponse> openKmsService(OpenKmsServiceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the access policy that must be granted to a Resource Access Management (RAM) user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>Only generic secrets support this API operation. Each generic secret can store up to 10 secret versions. If the limit is exceeded, KMS automatically deletes the earliest secret version.</li>
     * <li>By default, a newly stored secret value is marked with ACSCurrent, and the previous version marked with ACSCurrent is marked with ACSPrevious. You can override this default behavior by specifying the VersionStages parameter.</li>
     * <li>This API operation is used to store a new version of a secret value, not to modify the secret value of an existing version. When you store a new version, you must specify a version ID. KMS performs operations based on the following rules:<ul>
     * <li>If the version ID does not exist in the secret: A new version is created and the secret value is stored.</li>
     * <li>If the version ID already exists in the secret: If the secret value in the request is the same as the secret value corresponding to the version ID in the secret, the request is ignored and a success response is returned (the request is idempotent). If the secret values are different, the request is rejected and a failure response is returned.
     * This topic provides an example of storing a new version of a secret value for the secret named <code>secret001</code>. The version ID <code>VersionId</code> of the new secret version is <code>v3</code>, and the secret value <code>SecretData</code> is <code>importantdata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of PutSecretValue  PutSecretValueRequest
     * @return PutSecretValueResponse
     */
    CompletableFuture<PutSecretValueResponse> putSecretValue(PutSecretValueRequest request);

    /**
     * <b>description</b> :
     * <h3>Notes</h3>
     * <ul>
     * <li>For more information about the access policy required to grant a RAM user or RAM role the permission to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible only through a shared gateway, not a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.
     * When using a shared gateway, you access KMS through an Internet or a VPC domain name. This method requires Internet access to be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>This operation is accessible only through a shared gateway. The single-user queries per second (QPS) limit is 750. If this limit is exceeded, requests are throttled, which may affect your business. We recommend that you stay within the specified limit.</p>
     * <h3>Details</h3>
     * <p>You can use the ReEncrypt operation in the following scenarios:</p>
     * <ul>
     * <li>After a customer master key (CMK) is rotated, you can use the latest key version to re-encrypt data. For more information about automatic key rotation, see <a href="https://help.aliyun.com/document_detail/134270.html">Automatic key rotation</a>.</li>
     * <li>You can re-encrypt data by changing the encryption context without changing the master key.</li>
     * <li>You can re-encrypt data or a data key that is encrypted by one master key with another master key in KMS.
     * The ReEncrypt operation requires the following permissions:</li>
     * <li>The kms:ReEncryptFrom permission for the source master key.</li>
     * <li>The kms:ReEncryptTo permission for the destination master key.</li>
     * <li>You can use kms:ReEncrypt\* to grant both permissions.</li>
     * </ul>
     * 
     * @param request the request parameters of ReEncrypt  ReEncryptRequest
     * @return ReEncryptResponse
     */
    CompletableFuture<ReEncryptResponse> reEncrypt(ReEncryptRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that is required to allow a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Subscription instances cannot be manually released. You can only unsubscribe from them under specific conditions. To unsubscribe, go to the Expenses and Costs page in the console and choose Unsubscribe. For more information, see <a href="https://help.aliyun.com/document_detail/600418.html">Unsubscription policy</a>.</li>
     * <li>After you release an instance, all resources in the instance are also released. Resources that are encrypted using keys in the instance cannot be decrypted, and credentials cannot be retrieved. Before you release an instance, make sure that no data is encrypted by the keys in the instance and no services call the credentials. This prevents service interruptions.</li>
     * <li>If your instance is a software key management instance, we recommend that you back up the resources of the instance before you release it. The backed-up resources can be recovered. For more information, see <a href="https://help.aliyun.com/document_detail/2357488.html">Backup management</a>.</li>
     * <li>The billing epoch is daily. Therefore, after you release a pay-as-you-go instance, the bill for the previous day is pushed before 12:00 on the next day.</li>
     * <li>Before you release a KMS instance, we recommend that you check whether deletion protection is enabled for the instance in the console. If deletion protection is enabled, disable it in the console before you release the instance. For more information, see <a href="https://help.aliyun.com/document_detail/604735.html">Manage a KMS instance</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseKmsInstance  ReleaseKmsInstanceRequest
     * @return ReleaseKmsInstanceResponse
     */
    CompletableFuture<ReleaseKmsInstanceResponse> releaseKmsInstance(ReleaseKmsInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can only use this operation to restore a deleted secret that is within its recovery period. If you set <strong>ForceDeleteWithoutRecovery</strong> to <strong>true</strong> when you delete the secret, you cannot restore it.</p>
     * 
     * @param request the request parameters of RestoreSecret  RestoreSecretRequest
     * @return RestoreSecretResponse
     */
    CompletableFuture<RestoreSecretResponse> restoreSecret(RestoreSecretRequest request);

    /**
     * <b>description</b> :
     * <p>Limits:
     * • A secret of each Alibaba Cloud account can be rotated for a maximum of 50 times per hour.
     * • The RotateSecret operation is unavailable for standard secrets.
     * In this example, the <code>RdsSecret/Mysql5.4/MyCred</code> secret is manually rotated, and the version number of the secret is set to <code>000000123</code> after the secret is rotated.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of RotateSecret  RotateSecretRequest
     * @return RotateSecretResponse
     */
    CompletableFuture<RotateSecretResponse> rotateSecret(RotateSecretRequest request);

    /**
     * <b>description</b> :
     * <p>During the scheduled period, the CMK is in the PendingDeletion state and cannot be used to encrypt data, decrypt data, or generate data keys.
     * After a CMK is deleted, it cannot be recovered. Data that is encrypted and data keys that are generated by using the CMK cannot be decrypted. To prevent accidental deletion of CMKs, Key Management Service (KMS) allows you to only schedule key deletion tasks. You cannot directly delete CMKs. If you want to delete a CMK, call the <a href="https://help.aliyun.com/document_detail/35151.html">DisableKey</a> operation to disable the CMK.
     * When you call this operation, you must specify a scheduled period between 7 days to 366 days. The scheduled period starts from the time when you submit the request. You can call the <a href="https://help.aliyun.com/document_detail/44197.html">CancelKeyDeletion</a> operation to cancel the key deletion task before the scheduled period ends.</p>
     * 
     * @param request the request parameters of ScheduleKeyDeletion  ScheduleKeyDeletionRequest
     * @return ScheduleKeyDeletionResponse
     */
    CompletableFuture<ScheduleKeyDeletionResponse> scheduleKeyDeletion(ScheduleKeyDeletionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the access policy that must be granted to a Resource Access Management (RAM) user or RAM role to invoke this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>After you enable deletion protection for a CMK, you cannot delete the CMK. To delete the CMK, disable deletion protection first.  </li>
     * <li>Before you invoke the SetDeletionProtection operation, make sure that the CMK is not in the PendingDeletion state. You can invoke the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status (KeyState) of the CMK.</li>
     * </ul>
     * 
     * @param request the request parameters of SetDeletionProtection  SetDeletionProtectionRequest
     * @return SetDeletionProtectionResponse
     */
    CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>For more information about key policies, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetKeyPolicy  SetKeyPolicyRequest
     * @return SetKeyPolicyResponse
     */
    CompletableFuture<SetKeyPolicyResponse> setKeyPolicy(SetKeyPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role requires to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>For more information about secret policies, see <a href="https://help.aliyun.com/document_detail/2716465.html">Secret policy overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetSecretPolicy  SetSecretPolicyRequest
     * @return SetSecretPolicyResponse
     */
    CompletableFuture<SetSecretPolicyResponse> setSecretPolicy(SetSecretPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can add up to 10 tags to a CMK, secret, or certificate.
     * In this example, the tags <code>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</code> are added to the CMK whose ID is <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of TagResource  TagResourceRequest
     * @return TagResourceResponse
     */
    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can add multiple tags to multiple keys or multiple secrets at a time.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the access policy that is required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.
     * This topic provides an example of how to detach tags with the tag keys tagkey1 and tagkey2 from the key with the ID <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.</p>
     * 
     * @param request the request parameters of UntagResource  UntagResourceRequest
     * @return UntagResourceResponse
     */
    CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can remove multiple tags from multiple keys or multiple secrets at a time. You cannot remove tags that start with aliyun or acs:.
     * If you enter multiple tag keys in the request parameters and only some of the tag keys are associated with resources, the operation can be called and the tags whose keys are associated with resources are removed from the resources.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAlias  UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    /**
     * <b>description</b> :
     * <p>The update takes effect immediately after an AAP information is updated. Exercise caution when you perform this operation. You can update the description of an AAP and the permission policies that are associated with the AAP. You cannot update the name of the AAP.</p>
     * 
     * @param request the request parameters of UpdateApplicationAccessPoint  UpdateApplicationAccessPointRequest
     * @return UpdateApplicationAccessPointResponse
     */
    CompletableFuture<UpdateApplicationAccessPointResponse> updateApplicationAccessPoint(UpdateApplicationAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation. Use this operation to add, modify, or delete the description of a CMK.
     * For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * @param request the request parameters of UpdateKeyDescription  UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     */
    CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescription(UpdateKeyDescriptionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>If your self-managed application is deployed in multiple VPCs in the same region, you can bind the KMS instance to additional VPCs. These VPCs are in addition to the one that you specified when you enabled the instance.
     * These VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, self-managed applications in these VPCs can access the specified KMS instance.<blockquote>
     * <p>If the VPCs belong to different Alibaba Cloud accounts, you must first configure resource sharing to share the vSwitch resources from those accounts with the Alibaba Cloud account that owns the KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2393236.html">Access a KMS instance from multiple VPCs in the same region</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKmsInstanceBindVpc  UpdateKmsInstanceBindVpcRequest
     * @return UpdateKmsInstanceBindVpcResponse
     */
    CompletableFuture<UpdateKmsInstanceBindVpcResponse> updateKmsInstanceBindVpc(UpdateKmsInstanceBindVpcRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>You can only modify the private IP addresses and description of a network control rule. The name and network type cannot be modified.</li>
     * <li>When you update a network control rule, the access policies attached to it are also updated. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateNetworkRule  UpdateNetworkRuleRequest
     * @return UpdateNetworkRuleResponse
     */
    CompletableFuture<UpdateNetworkRuleResponse> updateNetworkRule(UpdateNetworkRuleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update the role-based access control (RBAC) permissions, accessible resources, access control rules, and description of a permission policy. You cannot update the name or scope of a permission policy.</li>
     * <li>Updating a permission policy affects all application access points (AAPs) that are bound to the permission policy. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>When automatic key rotation is enabled, KMS automatically creates a key version after the preset rotation period arrives. In addition, KMS sets the new key version as the primary key version.
     * An automatic key rotation policy cannot be configured for the following keys:</p>
     * <ul>
     * <li>Asymmetric key</li>
     * <li>Service-managed key</li>
     * <li>Bring your own key (BYOK) that is imported into KMS</li>
     * <li>Key that is not in the <strong>Enabled</strong> state
     * In this example, automatic key rotation is enabled for a CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The automatic rotation period is 30 days.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRotationPolicy  UpdateRotationPolicyRequest
     * @return UpdateRotationPolicyResponse
     */
    CompletableFuture<UpdateRotationPolicyResponse> updateRotationPolicy(UpdateRotationPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the metadata of the <code>secret001</code> secret is updated. The <code>Description</code> parameter is set to <code>datainfo</code>.</p>
     * 
     * @param request the request parameters of UpdateSecret  UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    CompletableFuture<UpdateSecretResponse> updateSecret(UpdateSecretRequest request);

    /**
     * <b>description</b> :
     * <p>After automatic rotation is enabled, Secrets Manager schedules the first automatic rotation by adding the preset rotation interval to the timestamp of the last rotation.
     * Limits: The UpdateSecretRotationPolicy operation cannot be used to update the rotation policy of generic secrets.
     * In this example, the rotation policy of the <code>RdsSecret/Mysql5.4/MyCred</code> secret is updated. The following settings are modified:</p>
     * <ul>
     * <li>The <code>EnableAutomaticRotation</code> parameter is set to <code>true</code>, which indicates that automatic rotation is enabled.</li>
     * <li>The <code>RotationInterval</code> parameter is set to <code>30d</code>, which indicates that the interval for automatic rotation is 30 days.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSecretRotationPolicy  UpdateSecretRotationPolicyRequest
     * @return UpdateSecretRotationPolicyResponse
     */
    CompletableFuture<UpdateSecretRotationPolicyResponse> updateSecretRotationPolicy(UpdateSecretRotationPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy that is required to call this operation as a Resource Access Management (RAM) user or RAM role, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports only generic secrets. You can perform the following operations:<ul>
     * <li>Add a version stage to a specified secret version.</li>
     * <li>Remove a version stage from a specified secret version.</li>
     * <li>Remove a version stage from a specified secret version and attach it to another secret version.</li>
     * </ul>
     * </li>
     * <li>The total number of version stages for each generic secret cannot exceed 8.
     * This topic provides an example of how to update the version stage of the secret named <code>secret001</code>. In this example, the <code>ACSCurrent</code> stage is used to mark version <code>002</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSecretVersionStage  UpdateSecretVersionStageRequest
     * @return UpdateSecretVersionStageResponse
     */
    CompletableFuture<UpdateSecretVersionStageResponse> updateSecretVersionStage(UpdateSecretVersionStageRequest request);

    /**
     * <b>description</b> :
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through a shared gateway or a dedicated gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through a public or VPC endpoint. This method requires you to enable the public network access switch. For more information, refer to accessing keys in a KMS instance over the Internet.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<YOUR_KMS_INSTANCE_ID>.cryptoservice.kms.aliyuncs.com).</li>
     * </ul>
     * 
     * @param request the request parameters of VerifyMac  VerifyMacRequest
     * @return VerifyMacResponse
     */
    CompletableFuture<VerifyMacResponse> verifyMac(VerifyMacRequest request);

}
