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
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists supported encryption algorithms. </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum length in bytes</th>
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
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6144</td>
     * </tr>
     * <tr>
     * <td>In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the decryption algorithm <code>RSAES_OAEP_SHA_1</code> are used to decrypt the ciphertext <code>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</code>.</td>
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
     * <p>This operation is supported only for asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists the supported encryption algorithms: </p>
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
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6047</td>
     * </tr>
     * <tr>
     * <td>You can use the asymmetric CMK whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the algorithm <code>RSAES_OAEP_SHA_1</code> to encrypt the plaintext <code>SGVsbG8gd29ybGQ=</code> based on the parameter settings provided in this topic.</td>
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
     * <p>Generates a signature by using an asymmetric key.</p>
     * 
     * @param request the request parameters of AsymmetricSign  AsymmetricSignRequest
     * @return AsymmetricSignResponse
     */
    CompletableFuture<AsymmetricSignResponse> asymmetricSign(AsymmetricSignRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table describes the supported signature algorithms. </p>
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
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p> When you calculate the SM2 signature based on GB/T 32918, the <strong>Digest</strong> parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T 32918.  In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the signature algorithm RSA_PSS_SHA_256 are used to verify the signature <code>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==</code> of the digest <code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AsymmetricVerify  AsymmetricVerifyRequest
     * @return AsymmetricVerifyResponse
     */
    CompletableFuture<AsymmetricVerifyResponse> asymmetricVerify(AsymmetricVerifyRequest request);

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
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to decrypt the data <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePrivateKeyDecrypt  CertificatePrivateKeyDecryptRequest
     * @return CertificatePrivateKeyDecryptResponse
     */
    CompletableFuture<CertificatePrivateKeyDecryptResponse> certificatePrivateKeyDecrypt(CertificatePrivateKeyDecryptRequest request);

    /**
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to generate a signature for the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePrivateKeySign  CertificatePrivateKeySignRequest
     * @return CertificatePrivateKeySignResponse
     */
    CompletableFuture<CertificatePrivateKeySignResponse> certificatePrivateKeySign(CertificatePrivateKeySignRequest request);

    /**
     * <b>description</b> :
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to encrypt the data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePublicKeyEncrypt  CertificatePublicKeyEncryptRequest
     * @return CertificatePublicKeyEncryptResponse
     */
    CompletableFuture<CertificatePublicKeyEncryptResponse> certificatePublicKeyEncrypt(CertificatePublicKeyEncryptRequest request);

    /**
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to verify the digital signature <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code> of the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePublicKeyVerify  CertificatePublicKeyVerifyRequest
     * @return CertificatePublicKeyVerifyResponse
     */
    CompletableFuture<CertificatePublicKeyVerifyResponse> certificatePublicKeyVerify(CertificatePublicKeyVerifyRequest request);

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
     * <p>KMS supports common symmetric keys and asymmetric keys. For more information, see <a href="https://help.aliyun.com/document_detail/480161.html">Key types and specifications</a>.</p>
     * 
     * @param request the request parameters of CreateKey  CreateKeyRequest
     * @return CreateKeyResponse
     */
    CompletableFuture<CreateKeyResponse> createKey(CreateKeyRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation to create an asymmetric CMK and the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status of the CMK. The status is specified by the KeyState parameter.</p>
     * <ul>
     * <li>The minimum interval for creating a version of the same CMK is seven days. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.</li>
     * <li>If a CMK is in a private key store, you cannot create a version for the CMK.</li>
     * <li>You can create a maximum of 50 versions for a CMK in the same region.
     * You can create a version for the CMK whose ID is <code>0b30658a-ed1a-4922-b8f7-a673ca9c****</code> by using the parameter settings provided in this topic.</li>
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
     * <p>The name of the secret.
     * The value must be 1 to 64 characters in length and can contain letters, digits, underscores (_), forward slashes (/), plus signs (+), equal signs (=), periods (.), hyphens (-), and at signs (@). The following list describes the name requirements for different types of secrets:</p>
     * <ul>
     * <li>If the SecretType parameter is set to Generic or Rds, the name cannot start with <code>acs/</code>.</li>
     * <li>If the SecretType parameter is set to RAMCredentials, set the SecretName parameter to <code>$Auto</code>. In this case, KMS automatically generates a secret name that starts with <code>acs/ram/user/</code>. The name includes the display name of RAM user.</li>
     * <li>If the SecretType parameter is set to ECS, the name must start with <code>acs/ecs/</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
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
     * <p>Before you delete an AAP, make sure that the AAP is no longer in use. If you delete an AAP that is in use, applications that use the AAP cannot access Key Management Service (KMS). Exercise caution when you delete an AAP.</p>
     * 
     * @param request the request parameters of DeleteApplicationAccessPoint  DeleteApplicationAccessPointRequest
     * @return DeleteApplicationAccessPointResponse
     */
    CompletableFuture<DeleteApplicationAccessPointResponse> deleteApplicationAccessPoint(DeleteApplicationAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>After the certificate and its private key and certificate chain are deleted, they cannot be restored. Proceed with caution.
     * In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> and its private key and certificate chain are deleted.</p>
     * 
     * @param request the request parameters of DeleteCertificate  DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a client key, make sure that the client key is no longer in use. If you delete a client key that is in use, applications that use the client key cannot access Key Management Service (KMS). Exercise caution when you delete a client key.</p>
     * 
     * @param request the request parameters of DeleteClientKey  DeleteClientKeyRequest
     * @return DeleteClientKeyResponse
     */
    CompletableFuture<DeleteClientKeyResponse> deleteClientKey(DeleteClientKeyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation does not delete the CMK that is created by using the key material.
     * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
     * After you delete the key material, you can upload only the same key material into the CMK.</p>
     * 
     * @param request the request parameters of DeleteKeyMaterial  DeleteKeyMaterialRequest
     * @return DeleteKeyMaterialResponse
     */
    CompletableFuture<DeleteKeyMaterialResponse> deleteKeyMaterial(DeleteKeyMaterialRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a network access rule, make sure that the network access rule is not bound to permission policies. Otherwise, related applications cannot access Key Management Service (KMS).</p>
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
     * @param request the request parameters of DescribeAccountKmsStatus  DescribeAccountKmsStatusRequest
     * @return DescribeAccountKmsStatusResponse
     */
    CompletableFuture<DescribeAccountKmsStatusResponse> describeAccountKmsStatus(DescribeAccountKmsStatusRequest request);

    /**
     * @param request the request parameters of DescribeApplicationAccessPoint  DescribeApplicationAccessPointRequest
     * @return DescribeApplicationAccessPointResponse
     */
    CompletableFuture<DescribeApplicationAccessPointResponse> describeApplicationAccessPoint(DescribeApplicationAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the information about the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate information includes the certificate ID, creation time, certificate issuer, validity period, serial number, and signature algorithm.</p>
     * 
     * @param request the request parameters of DescribeCertificate  DescribeCertificateRequest
     * @return DescribeCertificateResponse
     */
    CompletableFuture<DescribeCertificateResponse> describeCertificate(DescribeCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the information about the CMK <code>05754286-3ba2-4fa6-8d41-4323aca6****</code> by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.</p>
     * 
     * @param request the request parameters of DescribeKey  DescribeKeyRequest
     * @return DescribeKeyResponse
     */
    CompletableFuture<DescribeKeyResponse> describeKey(DescribeKeyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about a version of the CMK <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The ID of the CMK version is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>. The response shows that the creation time of the CMK version is <code>2016-03-25T10:42:40Z</code>.</p>
     * 
     * @param request the request parameters of DescribeKeyVersion  DescribeKeyVersionRequest
     * @return DescribeKeyVersionResponse
     */
    CompletableFuture<DescribeKeyVersionResponse> describeKeyVersion(DescribeKeyVersionRequest request);

    /**
     * @param request the request parameters of DescribeNetworkRule  DescribeNetworkRuleRequest
     * @return DescribeNetworkRuleResponse
     */
    CompletableFuture<DescribeNetworkRuleResponse> describeNetworkRule(DescribeNetworkRuleRequest request);

    /**
     * @param request the request parameters of DescribePolicy  DescribePolicyRequest
     * @return DescribePolicyResponse
     */
    CompletableFuture<DescribePolicyResponse> describePolicy(DescribePolicyRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Kms%5C&api=DescribeRegions%5C&type=RPC%5C&version=2016-01-20">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
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
     * <p>  KMS uses the primary version of a specified CMK to encrypt data.</p>
     * <ul>
     * <li>Only data of 6 KB or less can be encrypted. For example, you can call this operation to encrypt RSA keys, database access passwords, or other sensitive information.</li>
     * <li>When you migrate encrypted data across regions, you can call this operation in the destination region to encrypt the plaintext of the data key that is used to encrypt the migrated data in the source region. This way, the ciphertext of the data key is generated in the destination region. You can also call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the data key.</li>
     * </ul>
     * 
     * @param request the request parameters of Encrypt  EncryptRequest
     * @return EncryptResponse
     */
    CompletableFuture<EncryptResponse> encrypt(EncryptRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation to generate a data key, which is encrypted by a CMK. If you want to distribute the data key to other regions or cryptographic modules, you can call the ExportDataKey operation to use a public key to encrypt the data key.
     * Then, you can import the ciphertext of the data key to the cryptographic module where the private key is stored. This way, the data key is securely distributed from KMS to the cryptographic module. After the data key is imported to the cryptographic module, you can use it to encrypt or decrypt data.</p>
     * 
     * @param request the request parameters of ExportDataKey  ExportDataKeyRequest
     * @return ExportDataKeyResponse
     */
    CompletableFuture<ExportDataKeyResponse> exportDataKey(ExportDataKeyRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you perform the following steps to import your data key to a cryptographic module:</p>
     * <ul>
     * <li>Call the GenerateAndExportDataKey operation to generate a data key and obtain both the ciphertext of the data key encrypted by using the CMK and that encrypted by using the public key.</li>
     * <li>Store the ciphertext of the data key encrypted by using the CMK in KMS Secrets Manager or in a storage service such as ApsaraDB. This ciphertext is used for backup and restoration.</li>
     * <li>Import the ciphertext of the data key encrypted by using the public key to the cryptographic module where the private key is stored. Then, you can use the data key to encrypt or decrypt data.<blockquote>
     * <p> The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the data keys randomly generated by calling this operation. You must take note of the data keys and the returned ciphertext.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GenerateAndExportDataKey  GenerateAndExportDataKeyRequest
     * @return GenerateAndExportDataKeyResponse
     */
    CompletableFuture<GenerateAndExportDataKeyResponse> generateAndExportDataKey(GenerateAndExportDataKeyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to locally encrypt your data without using KMS and store the encrypted data together with the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext parameter in the response and the ciphertext of the data key from the CiphertextBlob parameter in the response.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key. Therefore, you need to store the ciphertext of the data key in persistent storage.
     * We recommend that you locally encrypt data by performing the following steps:
     * 1\. Call the GenerateDataKey operation.
     * 2\. Use the plaintext of the data key that you obtain to locally encrypt data without using KMS. Then, delete the plaintext of the data key from the memory.
     * 3\. Store the encrypted data together with the ciphertext of the data key that you obtain.
     * We recommend that you locally decrypt data by performing the following steps:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the locally stored ciphertext of the data key. The plaintext of data key is then returned.</li>
     * <li>Use the plaintext of the data key to locally decrypt data and then delete the plaintext of the data key from the memory.
     * In this example, a random data key is generated for the CMK whose ID is <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateDataKey  GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     */
    CompletableFuture<GenerateDataKeyResponse> generateDataKey(GenerateDataKeyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using a specific symmetric CMK, and returns the ciphertext of the data key. This operation serves the same purpose as the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a> operation. The only difference is that this operation does not return the plaintext of the data key.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key.</p>
     * <blockquote>
     * <ul>
     * <li>This operation applies to the scenario when you do not need to use the data key to immediately encrypt data. Before you can use the data key to encrypt data, you must call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the ciphertext of the data key.</li>
     * <li>This operation is also suitable for a distributed system with different trust levels. For example, a system stores data in different partitions based on a preset trust policy. A module creates different partitions and generates different data keys for each partition in advance. This module is not involved in data production and consumption after it completes initialization of the control plane. This module is the key provider. When producing and consuming data, modules on the control plane obtain the ciphertext of the data key for a partition first. After decrypting the ciphertext of the data key, modules on the control plane use the plaintext of the data key to encrypt or decrypt data and then clear the plaintext of the data key from the memory. In such a system, the key provider does not need to obtain the plaintext of the data key. It only needs to have the permissions to call the GenerateDataKeyWithoutPlaintext operation. The data producers or consumers do not need to generate new data keys. They only need to have the permissions to call the Decrypt operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateDataKeyWithoutPlaintext  GenerateDataKeyWithoutPlaintextRequest
     * @return GenerateDataKeyWithoutPlaintextResponse
     */
    CompletableFuture<GenerateDataKeyWithoutPlaintextResponse> generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate, certificate chain, certificate ID, and certificate signing request (CSR) are returned.</p>
     * 
     * @param request the request parameters of GetCertificate  GetCertificateRequest
     * @return GetCertificateResponse
     */
    CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request);

    /**
     * @param request the request parameters of GetClientKey  GetClientKeyRequest
     * @return GetClientKeyResponse
     */
    CompletableFuture<GetClientKeyResponse> getClientKey(GetClientKeyRequest request);

    /**
     * @param request the request parameters of GetDefaultKmsInstance  GetDefaultKmsInstanceRequest
     * @return GetDefaultKmsInstanceResponse
     */
    CompletableFuture<GetDefaultKmsInstanceResponse> getDefaultKmsInstance(GetDefaultKmsInstanceRequest request);

    /**
     * @param request the request parameters of GetKeyPolicy  GetKeyPolicyRequest
     * @return GetKeyPolicyResponse
     */
    CompletableFuture<GetKeyPolicyResponse> getKeyPolicy(GetKeyPolicyRequest request);

    /**
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
     * @param request the request parameters of GetPublicKey  GetPublicKeyRequest
     * @return GetPublicKeyResponse
     */
    CompletableFuture<GetPublicKeyResponse> getPublicKey(GetPublicKeyRequest request);

    /**
     * @param request the request parameters of GetRandomPassword  GetRandomPasswordRequest
     * @return GetRandomPasswordResponse
     */
    CompletableFuture<GetRandomPasswordResponse> getRandomPassword(GetRandomPasswordRequest request);

    /**
     * @param request the request parameters of GetSecretPolicy  GetSecretPolicyRequest
     * @return GetSecretPolicyResponse
     */
    CompletableFuture<GetSecretPolicyResponse> getSecretPolicy(GetSecretPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not specify a version number or stage label, Secrets Manager returns the secret value of the version marked with ACSCurrent.
     * If a customer master key (CMK) is specified to encrypt the secret value, you must also have the <code>kms:Decrypt</code> permission on the CMK to call the GetSecretValue operation.
     * In this example, the value of the secret named <code>secret001</code> is obtained. The secret value is returned in the <code>SecretData</code> parameter. The secret value is <code>testdata1</code>.</p>
     * 
     * @param request the request parameters of GetSecretValue  GetSecretValueRequest
     * @return GetSecretValueResponse
     */
    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    /**
     * <b>description</b> :
     * <p>Call <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> when creating a CMK, you can select its key material source as external. <strong>Origin</strong> set to <strong>EXTERNAL</strong>. This API is used to import the key material into the CMK.</p>
     * <ul>
     * <li>To view the CMK <strong>Origin</strong>, see <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a>.</li>
     * <li>Before importing key material, you need to call the <a href="https://help.aliyun.com/document_detail/68621.html">GetParametersForImport</a> obtain the parameters required to import the key material, including the public key and import token.<blockquote>
     * <ul>
     * <li>The key type of the pair is <strong>Aliyun_AES_256</strong> the key material must be 256 bits. The key type must be <strong>Aliyun_SM4</strong> the CMK and key material must be 128 bits.</li>
     * <li>You can set the expiration time for the key material, or you can set it to never expire.</li>
     * <li>You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.</li>
     * <li>After the imported key material expires or is deleted, the specified CMK is unavailable until the same key material are imported again.</li>
     * <li>A Key material can be imported to multiple cmks, but any Data or Data Key encrypted by one CMK cannot be decrypted by another CMK.</li>
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
     * @param request the request parameters of ListApplicationAccessPoints  ListApplicationAccessPointsRequest
     * @return ListApplicationAccessPointsResponse
     */
    CompletableFuture<ListApplicationAccessPointsResponse> listApplicationAccessPoints(ListApplicationAccessPointsRequest request);

    /**
     * @param request the request parameters of ListClientKeys  ListClientKeysRequest
     * @return ListClientKeysResponse
     */
    CompletableFuture<ListClientKeysResponse> listClientKeys(ListClientKeysRequest request);

    /**
     * @param request the request parameters of ListKeyVersions  ListKeyVersionsRequest
     * @return ListKeyVersionsResponse
     */
    CompletableFuture<ListKeyVersionsResponse> listKeyVersions(ListKeyVersionsRequest request);

    /**
     * @param request the request parameters of ListKeys  ListKeysRequest
     * @return ListKeysResponse
     */
    CompletableFuture<ListKeysResponse> listKeys(ListKeysRequest request);

    /**
     * @param request the request parameters of ListKmsInstances  ListKmsInstancesRequest
     * @return ListKmsInstancesResponse
     */
    CompletableFuture<ListKmsInstancesResponse> listKmsInstances(ListKmsInstancesRequest request);

    /**
     * @param request the request parameters of ListNetworkRules  ListNetworkRulesRequest
     * @return ListNetworkRulesResponse
     */
    CompletableFuture<ListNetworkRulesResponse> listNetworkRules(ListNetworkRulesRequest request);

    /**
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
     * <p>The secret value is not included in the returned version information. By default, deprecated secret versions are not returned.</p>
     * 
     * @param request the request parameters of ListSecretVersionIds  ListSecretVersionIdsRequest
     * @return ListSecretVersionIdsResponse
     */
    CompletableFuture<ListSecretVersionIdsResponse> listSecretVersionIds(ListSecretVersionIdsRequest request);

    /**
     * <b>description</b> :
     * <p>Specifies whether to return the resource tags of the secret. Valid values:</p>
     * <ul>
     * <li>true: returns the resource tags.</li>
     * <li>false: does not return the resource tags. This is the default value.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSecrets  ListSecretsRequest
     * @return ListSecretsResponse
     */
    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, note that:</p>
     * <ul>
     * <li>KMS is a paid service. For more information about the billing method, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/billing-billing">Billing description</a>.</li>
     * <li>An Alibaba Cloud account can activate KMS only once.</li>
     * <li>Make sure that your Alibaba Cloud account has passed real-name authentication.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenKmsService  OpenKmsServiceRequest
     * @return OpenKmsServiceResponse
     */
    CompletableFuture<OpenKmsServiceResponse> openKmsService(OpenKmsServiceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to store the secret values of new versions. It cannot be used to modify the secret value of an existing version.
     * By default, the newly stored secret value is marked with ACSCurrent, and the mark for the previous version of the secret value is changed from ACSCurrent to ACSPrevious. If you specify the VersionStage parameter, the newly stored secret value is marked with the stage label that you specify.
     * You must specify a version number when you call the operation. Secrets Manager performs operations based on the following rules:</p>
     * <ul>
     * <li>If the specified version number does not exist in the secret, Secrets Manager creates the version and stores the secret value.</li>
     * <li>If the specified version number already exists in the secret and the secret value of the existing version is the same as the secret value that you specify, Secrets Manager ignores the request and returns a success message. The request is idempotent.</li>
     * <li>If the specified version number already exists in the secret but the secret value of the existing version is different from the secret value that you specify, Secrets Manager rejects the request and returns a failure message.
     * Limits: This operation is available only for standard secrets.
     * In this example, the secret value of a new version is stored into the <code>secret001</code> secret. The <code>VersionId</code> parameter is set to <code>00000000000000000000000000000000203</code> as the new version, and the <code>SecretData</code> parameter is set to <code>importantdata</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of PutSecretValue  PutSecretValueRequest
     * @return PutSecretValueResponse
     */
    CompletableFuture<PutSecretValueResponse> putSecretValue(PutSecretValueRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation in the following scenarios:</p>
     * <ul>
     * <li>After the CMK that was used to encrypt your data is rotated, you can call this operation to use the latest CMK version to re-encrypt the data. For more information about automatic key rotation, see <a href="https://help.aliyun.com/document_detail/134270.html">Configure automatic key rotation</a>.</li>
     * <li>The CMK that was used to encrypt your data remains unchanged, but EncryptionContext is changed. In this scenario, you can call this operation to re-encrypt the data.</li>
     * <li>You can call this operation to use a CMK in KMS to re-encrypt data or a data key that was previously encrypted by a different CMK.
     * To use the ReEncrypt operation, you must have two permissions:</li>
     * <li>kms:ReEncryptFrom on the source CMK</li>
     * <li>kms:ReEncryptTo on the destination CMK</li>
     * <li>For simplicity, you can specify kms:ReEncrypt\* to allow both of the preceding permissions.</li>
     * </ul>
     * 
     * @param request the request parameters of ReEncrypt  ReEncryptRequest
     * @return ReEncryptResponse
     */
    CompletableFuture<ReEncryptResponse> reEncrypt(ReEncryptRequest request);

    /**
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
     * In this example, the <code>RdsSecret/Mysql5.4/MyCred</code> secret is manually rotated, and the version number of the secret is set to <code>000000123</code> after the secret is rotated.</p>
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
     * <p>  After you enable deletion protection for a CMK, you cannot delete the CMK. If you want to delete the CMK, you must first disable deletion protection for the CMK.</p>
     * <ul>
     * <li>Before you can call the SetDeletionProtection operation, make sure that the required CMK is not in the Pending Deletion state. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the CMK status, which is specified by the KeyState parameter.
     * You can enable deletion protection for the CMK whose Alibaba Cloud Resource Name (ARN) is <code>acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****</code> by using parameter settings provided in this topic. The CMK ARN is specified by the ProtectedResourceArn parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of SetDeletionProtection  SetDeletionProtectionRequest
     * @return SetDeletionProtectionResponse
     */
    CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request);

    /**
     * @param request the request parameters of SetKeyPolicy  SetKeyPolicyRequest
     * @return SetKeyPolicyResponse
     */
    CompletableFuture<SetKeyPolicyResponse> setKeyPolicy(SetKeyPolicyRequest request);

    /**
     * @param request the request parameters of SetSecretPolicy  SetSecretPolicyRequest
     * @return SetSecretPolicyResponse
     */
    CompletableFuture<SetSecretPolicyResponse> setSecretPolicy(SetSecretPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can add up to 10 tags to a CMK, secret, or certificate.
     * In this example, the tags <code>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</code> are added to the CMK whose ID is <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.</p>
     * 
     * @param request the request parameters of TagResource  TagResourceRequest
     * @return TagResourceResponse
     */
    CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can add multiple tags to multiple keys or multiple secrets at a time.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>One or more tag keys. Separate multiple tag keys with commas (,).
     * You need to specify only the tag keys, not the tag values.
     * Each tag key must be 1 to 128 bytes in length.</p>
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
     * <p>In this example, the status of the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is updated to INACTIVE.</p>
     * 
     * @param request the request parameters of UpdateCertificateStatus  UpdateCertificateStatusRequest
     * @return UpdateCertificateStatusResponse
     */
    CompletableFuture<UpdateCertificateStatusResponse> updateCertificateStatus(UpdateCertificateStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation. You can call this operation to add, modify, or delete the description of a CMK.</p>
     * 
     * @param request the request parameters of UpdateKeyDescription  UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     */
    CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescription(UpdateKeyDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>If your own applications are deployed in multiple VPCs in the same region, you can associate the VPCs except the VPC in which the KMS instance resides with the KMS instance. This topic describes how to configure the VPCs.
     * The VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, the applications in these VPCs can access the KMS instance.</p>
     * <blockquote>
     * <p>If the VPCs belong to different Alibaba Cloud accounts, you must first configure resource sharing to share the vSwitches of other Alibaba Cloud accounts with the Alibaba Cloud account to which the KMS instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/2393236.html">Access a KMS instance from multiple VPCs in the same region</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateKmsInstanceBindVpc  UpdateKmsInstanceBindVpcRequest
     * @return UpdateKmsInstanceBindVpcResponse
     */
    CompletableFuture<UpdateKmsInstanceBindVpcResponse> updateKmsInstanceBindVpc(UpdateKmsInstanceBindVpcRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update only private IP addresses and description of an access control rule. You cannot update the name and network type of an access control rule.</li>
     * <li>Updating an access control rule affects all permission policies that are bound to the access control rule. Exercise caution when you perform this operation.</li>
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
     * In this example, automatic key rotation is enabled for a CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The automatic rotation period is 30 days.</li>
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
     * <p>Updates the stage label that marks a secret version.</p>
     * 
     * @param request the request parameters of UpdateSecretVersionStage  UpdateSecretVersionStageRequest
     * @return UpdateSecretVersionStageResponse
     */
    CompletableFuture<UpdateSecretVersionStageResponse> updateSecretVersionStage(UpdateSecretVersionStageRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, a certificate issued by a CA is imported into Certificates Manager. The ID of the certificate in Certificates Manager is <code>12345678-1234-1234-1234-12345678****</code>.</p>
     * 
     * @param request the request parameters of UploadCertificate  UploadCertificateRequest
     * @return UploadCertificateResponse
     */
    CompletableFuture<UploadCertificateResponse> uploadCertificate(UploadCertificateRequest request);

}
